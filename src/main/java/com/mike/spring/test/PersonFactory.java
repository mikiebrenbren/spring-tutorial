package com.mike.spring.test;

/**
 * Created by michaelbrennan on 3/21/15.
 */
public class PersonFactory {

    public Person createPerson(String id, String name){
        System.out.println("Creating person in PersonFactory");
        return new Person(id, name);
    }
}
