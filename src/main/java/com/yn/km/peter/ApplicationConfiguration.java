package com.yn.km.peter;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * 加载系统配置，开启任务执行检测
 */
@Configuration
@EnableScheduling
public class ApplicationConfiguration {

    @Resource
    private Environment environment;

    /**
     * 加载配置
     *
     * @return
     */
    @Bean
    public static PropertyPlaceholderConfigurer loadProperties() {
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setFileEncoding("UTF-8");
        ClassPathResource globalResource = new ClassPathResource("global.properties");
        ClassPathResource dbConfig = new ClassPathResource("dbconfig.properties");
        ClassPathResource templateResource = new ClassPathResource("template.properties");
        configurer.setLocations(globalResource, dbConfig, templateResource);
        return configurer;
    }

    /**
     * 模板解析配置
     * InternalResourceViewResolver
     *
     * @return
     */
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setViewClass(JstlView.class);
        resourceViewResolver.setPrefix("/WEB-INF/jsp/");
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setOrder(1);
        return resourceViewResolver;
    }

    /**
     * 表单文件处理配置
     *
     * @return
     * @throws IOException
     */
    @Bean
    public CommonsMultipartResolver multipartResolver() throws IOException {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        FileSystemResource tmpFilePath = new FileSystemResource(new File(environment.getRequiredProperty("file_upload_storage")));
        tmpFilePath.createRelative("tmp");
        multipartResolver.setUploadTempDir(tmpFilePath);
        multipartResolver.setMaxUploadSize(52428800);
        multipartResolver.setDefaultEncoding("UTF-8");
        multipartResolver.setMaxUploadSizePerFile(5242880);
        multipartResolver.setMaxInMemorySize(4096);
        return multipartResolver;
    }

    /**
     * 配置数据源
     * @return
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(environment.getRequiredProperty("druid.url"));
        dataSource.setUsername(environment.getRequiredProperty("druid.username"));
        dataSource.setPassword(environment.getRequiredProperty("druid.password"));
        dataSource.setRemoveAbandoned(false);
        dataSource.setLogAbandoned(true);
        dataSource.setMaxActive(20);
        dataSource.setInitialSize(1);
        dataSource.setMaxWait(60000);
        dataSource.setMinIdle(1);
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        dataSource.setMinEvictableIdleTimeMillis(60000);
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxOpenPreparedStatements(20);
        return dataSource;
    }

    /**
     * 配置数据连接池
     * @return
     * @throws SQLException
     */
    @Bean
    public Connection connection() throws SQLException {
        DataSource dataSource = dataSource();
        Connection connection = dataSource.getConnection();
        connection.setAutoCommit(false);
        return connection;
    }
}
