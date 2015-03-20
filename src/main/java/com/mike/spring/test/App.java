package com.mike.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by michaelbrennan on 3/19/15.
 */
public class App {


    public static void main(String[]args){
        
        ApplicationContext context = new FileSystemXmlApplicationContext("spring-config.xml");

        Person person = (Person)context.getBean("person");
        person.speak();
    }
}
