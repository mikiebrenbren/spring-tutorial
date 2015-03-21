package com.mike.spring.test;

import com.mike.spring.test.human.Address;
import com.mike.spring.test.human.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by michaelbrennan on 3/19/15.
 */
public class App {

    public static void main(String[]args){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        Person person = (Person)context.getBean("person");
        person.setTaxId(666);
        System.out.println(person);


        Address address2 = (Address) context.getBean(("address2"));
        System.out.println(address2);

                ((ClassPathXmlApplicationContext) context).close();


    }
}
