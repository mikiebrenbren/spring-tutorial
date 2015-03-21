package com.mike.spring.test.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnimalApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Jungle jungle = (Jungle)context.getBean("jungle");
        System.out.println(jungle);


        Jungle jungle1 = (Jungle)context.getBean("jungle2");
        System.out.println(jungle1);

        Jungle jungle2= (Jungle)context.getBean("jungle3");
        System.out.println(jungle2);

		((ClassPathXmlApplicationContext)context).close();
	}

}
