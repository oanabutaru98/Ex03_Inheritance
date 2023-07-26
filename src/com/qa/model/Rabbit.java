package com.qa.model;

public class Rabbit extends Animal{
    public Rabbit (String name, int age) {
        super(name, age);
    }
    @Override
    public String sayHello() {
        return "sniff sniff??";
    }

    @Override
    public String move() {
        return "rabbit moving";
    }

    @Override
    public String toString() {
        return "Rabbit: " + super.toString();
    }
}
