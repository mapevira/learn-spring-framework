package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * The App02HelloWorld main class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 1 May 2023 - 15:17:15
 */
@Slf4j
public class App01GamingBasicJava {

    /**
     * @param args
     */
    public static void main(String[] args) { 
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        if (log.isInfoEnabled()) {
            log.info((String) context.getBean("name"));
            log.info(((Integer) context.getBean("age")).toString());
            log.info(context.getBean("person").toString());
            log.info(context.getBean("address").toString());
        }

    }

}
