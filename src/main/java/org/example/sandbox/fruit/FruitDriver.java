package org.example.sandbox.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDriver {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Orange", 10));
        fruits.add(new Fruit("Apple", 5));
        fruits.add(new Fruit("Banana", 20));
        fruits.add(new Fruit("Apple", 15));
        fruits.add(new Fruit("Orange", 5));

        System.out.println("Before sorting:");
        fruits.forEach(System.out::println);

        Collections.sort(fruits);

        System.out.println("\nAfter sorting:");
        fruits.forEach(System.out::println);
    }
}
