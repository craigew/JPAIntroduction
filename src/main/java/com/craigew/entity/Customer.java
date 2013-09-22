package com.craigew.entity;

import javax.persistence.*;

@Entity
public class Customer extends BaseEntity{
    private String name;
    private String surname;
    private String identity_number;
    private int age;

    public Customer(String name, String surname, String identity_number, int age) {
        this.name = name;
        this.surname = surname;
        this.identity_number = identity_number;
        this.age = age;
    }

    protected Customer() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdentity_number() {
        return identity_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
