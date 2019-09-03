package com.yn.km.peter;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class SpringWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {

        container.setInitParameter("contextClass", AnnotationConfigWebApplicationContext.class.getName());
        /**
         *   load applicationContext.xml
         */
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(WebConfiguration.class);
        container.addListener(new ContextLoaderListener(rootContext));

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        container.addFilter("/*", new CharacterEncodingFilter());

        /**
         * load dispather-servlet.xml
         */
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(WebConfiguration.class);
        ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(webContext));
//        registration.setInitParameter("enableLoggingRequestDetails", "false");
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
