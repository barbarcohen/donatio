package cz.donatio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Rudolf on 28/06/16.
 */
@ComponentScan
@EnableAutoConfiguration
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class DonatioApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DonatioApplication.class);

        app.run(args);
    }

}
