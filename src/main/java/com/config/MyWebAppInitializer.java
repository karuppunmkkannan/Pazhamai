package com.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.util.Log4jConfigListener;

/**
 * @author suresh sampath
 */
public class MyWebAppInitializer
      extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[] { AppConfig.class };
   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] { WebConfig.class };
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }
   
   /*@Override
   public void onStartup(ServletContext container) {
       AnnotationConfigWebApplicationContext rootContext =
               new AnnotationConfigWebApplicationContext();
       rootContext.register(MyWebAppInitializer.class);
       container.addListener(Log4jConfigListener.class);
       container.setInitParameter("log4jConfiguration", "/WEB-INF/custom-name-log4j.xml");

       rootContext.setConfigLocation("com.ala");

       final FilterRegistration.Dynamic characterEncodingFilter = container.addFilter("characterEncodingFilter", new CharacterEncodingFilter());
       characterEncodingFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
       characterEncodingFilter.setInitParameter("encoding", "UTF-8");
       characterEncodingFilter.setInitParameter("forceEncoding", "true");

      // container.setInitParameter("spring.profiles.default", "prod");

      // rootContext.register(SecurityContextFilter.class);

       container.addListener(new ContextLoaderListener(rootContext));
       container.addListener(new RequestContextListener());

       container.setInitParameter("contextConfigLocation", "");

       final ServletContainer servlet = new ServletContainer();
       final ServletRegistration.Dynamic appServlet = container.addServlet("appServlet", servlet);
       appServlet.setInitParameter("jersey.config.server.provider.packages", "my.package");
       appServlet.setLoadOnStartup(1);

       //final Set<String> mappingConflicts = appServlet.addMapping("/rest/*");

   }*/
}
