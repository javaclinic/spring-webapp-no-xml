package example.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring (no-xml) configuration class. We are using component scanning of packages for Spring components.
 * 
 * @author nevenc
 *
 */
@Configuration
@ComponentScan(basePackages="example.services")
public class ApplicationConfiguration {

    // no additional beans configured

}
