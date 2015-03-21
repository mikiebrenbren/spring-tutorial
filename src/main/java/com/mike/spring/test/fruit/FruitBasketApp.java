package com.mike.spring.test.fruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitBasketApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		FruitBasket basket = (FruitBasket)context.getBean("basket");
		
		System.out.println(basket);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
