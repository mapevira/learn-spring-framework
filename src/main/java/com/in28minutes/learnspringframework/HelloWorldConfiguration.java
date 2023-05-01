package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The Hello World Configuration class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 1 May 2023 - 16:07:33
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Raul";
    }

}
