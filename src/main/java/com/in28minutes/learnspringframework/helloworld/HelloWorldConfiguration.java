package com.in28minutes.learnspringframework.helloworld;

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
        return new Person("Raul", 20, new Address("Main Street", "Utrecht"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "addressTo")
    public Address address() {
        return new Address("Baker Street", "Longon");
    }

}

record Person (String name, int age, Address address) {}

record Address (String firstLine, String city) {}
