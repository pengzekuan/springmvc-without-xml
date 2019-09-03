package com.yn.km.peter;

import com.yn.km.peter.interceptor.CustomerRequestInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * 加载系统配置，加载控制器等
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.yn.km.peter", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
})
@Import(ApplicationConfiguration.class)
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {

    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {

    }

    @Override
    public void addFormatters(FormatterRegistry formatterRegistry) {

    }

    /**
     * 加载拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomerRequestInterceptor())
                .addPathPatterns("/*/*")
                .excludePathPatterns("/admin/*", "/test");
    }

    /**
     * 配置资源访问映射
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("/upload/");
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/dist/css/").setCacheControl(CacheControl.noCache());
        registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/dist/fonts/");
        registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/dist/img/");
        registry.addResourceHandler("/script/**").addResourceLocations("/WEB-INF/dist/script/").setCacheControl(CacheControl.noCache());
        registry.addResourceHandler("/tools/**").addResourceLocations("/WEB-INF/dist/tools/");
        registry.addResourceHandler("/*.txt").addResourceLocations("/WEB-INF/dist/txt/");
        registry.addResourceHandler("/.ico").addResourceLocations("/WEB-INF/dist/img/");
    }

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

    }


    /**
     * 配置视图控制器
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/404").setViewName("404");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {

    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

    }

    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    public Validator getValidator() {
        return null;
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
