package com.mike.spring.test.human;

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

    public void onCreate(){
        System.out.println("Person createed " + this);
    }

    public void onDestroy(){
        System.out.println("Person destroyed.");
    }

    public static Person getInstance(String id, String name){
        System.out.println("Creating a person instance");
        return new Person(id, name);
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
