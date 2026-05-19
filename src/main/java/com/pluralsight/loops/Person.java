package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private double age;


    public Person(String firstName, String lastName, double age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Full Name: " + firstName + " " + lastName + " Age: " + age;
    }
}
