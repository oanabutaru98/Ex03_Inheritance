package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public String sayHello() {
        return "wof";
    }

    @Override
    public String move() {
        return "dog moving";
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString();
    }
}
