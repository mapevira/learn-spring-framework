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

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Raul", 20);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "Longon");
    }

}

record Person (String name, int age) {}

record Address (String firstLine, String city) {}
