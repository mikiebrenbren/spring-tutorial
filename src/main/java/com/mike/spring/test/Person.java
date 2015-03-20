package com.mike.spring.test;

import org.springframework.context.ApplicationContext;

/**
 * Created by michaelbrennan on 3/19/15.
 */
public class Person {

    private String name;
    private String id;
    private int taxId;
    private Address address;

    public Person(){
        
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void speak(){
        System.out.println("Hello, my name is Tunt");
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
