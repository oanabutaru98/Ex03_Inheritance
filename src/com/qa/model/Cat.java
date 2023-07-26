package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "meow";
    }

    @Override
    public String move() {
        return "cat moving";
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }


}
