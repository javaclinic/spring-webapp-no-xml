package example.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Spring Web application initializer. Replaces traditional XML approach.
 * 
 * @author nevenc
 *
 */
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        // configure spring context
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
        springContext.register(ApplicationConfiguration.class);

        // add spring context to servlet context listener
        servletContext.addListener(new ContextLoaderListener(springContext));

    }

}
