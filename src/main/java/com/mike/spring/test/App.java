package com.mike.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by michaelbrennan on 3/19/15.
 */
public class App {

    public static void main(String[]args){
        
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");
        Person person1 = (Person)context.getBean("person");

        person.setTaxId(666);

        System.out.println(person1);

        Address address = (Address) context.getBean("address");
        System.out.println(address);


    }
}
