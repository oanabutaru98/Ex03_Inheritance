package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;
import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cat c1 = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d1 = new Dog("Spot", 2);
        Rabbit r1 = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);

        // list
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(c1);
        animalList.add(c2);
        animalList.add(d1);
        animalList.add(r1);
        animalList.add(r2);

        System.out.println("Printing list:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }

        // map v1
        HashMap<String, Animal> animalMap = new HashMap<>();
        animalMap.put(c1.getName(), c1);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d1.getName(), d1);
        animalMap.put(r1.getName(), r1);
        animalMap.put(r2.getName(), r2);

        System.out.println("Printing map v1:");
        for (String key : animalMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + animalMap.get(key));
        }

        // mapv2
        HashMap<Animal, String> animalMap2 = new HashMap<>();
        animalMap2.put(c1, "Fluffy");
        animalMap2.put(c2, "doesnt like being picked up");
        animalMap2.put(d1, "overly excited about running");
        animalMap2.put(r1, "snuffles a lot");
        animalMap2.put(r2, "maybe be evil");

        System.out.println("Printing map v2:");
        for (Animal key : animalMap2.keySet()) {
            System.out.println("Key: " + key + " Value: " + animalMap2.get(key));
        }

        // create set
        HashSet<Animal> animalSet = new HashSet<>();
        animalSet.addAll(animalList);
        animalSet.add(c1);
        animalSet.add(c2);

        System.out.println("Printing set:");
        Iterator<Animal> iter = animalSet.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        // find dog in list
        for (Animal animal : animalList) {
            if (animal.getName().equals("Spot")) {
                System.out.println("Found in list: " + animal);
                break;
            }
        }

        // find dog in hashmap1
        Animal found = animalMap.get("Spot");
        System.out.println("Found in map v1: " + found);

        //find dog in hashmap2
        for (Animal animal : animalMap2.keySet()) {
            if (animal.getName().equals("Sport")) {
                System.out.println("Found in map v2: " + animal);
                break;
            }
        }

        //find dog in set
        for (Animal animal : animalSet) {
            if (animal.getName().equals("Spot")) {
                System.out.println("Found in set: " + animal);
                break;
            }
        }

        // sort animalList
        Collections.sort(animalList);
        System.out.println("Sorted animalList:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }

        // tree map
        TreeMap<String, Animal> tree = new TreeMap<>();
        tree.putAll(animalMap);
        System.out.println("Printing tree map:");
        for(String key : tree.keySet()) {
            System.out.println("Key: " + key + " Value: " + tree.get(key));
        }

//        Rectangle r1 = new Rectangle("rectangle1", "yellow", 0,0,10,10);
//        Rectangle r2 = new Rectangle("rectangle2", "green", 2,2,5,2);
//
//        System.out.println(r1);
//        System.out.println(r2);
//
//        System.out.println(r1 + " Center Point is: " + r1.getCenterPoint());
//        System.out.println(r1 + " Is square? " + (r1.isSquare()?"Yes":"No"));
//        System.out.println(r1 + " Area: " + r1.getArea());
//
//        System.out.println(r2 + " Center Point is: " + r2.getCenterPoint());
//        System.out.println(r2 + " Is square? " + (r2.isSquare()?"Yes":"No"));
//        System.out.println(r2 + " Area: " + r2.getArea());
//
//        Circle c1 = new Circle("circle1", "red", 0, 0, 10);
//        Circle c2 = new Circle("circle2", "blue", 10, 10, 5);
//        System.out.println(c1);
//        System.out.println(c2);
//
//        System.out.println(c1 + " Center point is: " + c1.getCenterPoint());
//        System.out.println(c1 + " Area is: " + c1.getArea());
//
//        System.out.println(c2 + " Center point is: " + c2.getCenterPoint());
//        System.out.println(c2 + " Area is: " + c2.getArea());
//
//        Shape s = new Circle("circle", "green", 2, 2, 2);
//        System.out.println(s.getColor());
//
//        Circle c3 = new Circle("circle3", "white", 0,0,10);
//        System.out.println(c3.getX() + " " +c3.getY());
//        c3.move(10.5, 4.3);
//        System.out.println(c3.getX() + " " +c3.getY());

    }
}
