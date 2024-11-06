package com.maxima.homework;

public class Zoo {
    private Cat cat;
    private Dog dog;
    private Duck duck;
    private Tiger tiger;

    public Zoo(Cat cat, Dog dog, Duck duck, Tiger tiger) {
        this.cat = cat;
        this.dog = dog;
        this.duck = duck;
        this.tiger = tiger;
    }

    public void showAnimals() {
        System.out.printf("Cat: %s, age: %d%n", cat.getName(), cat.getAge());
        System.out.printf("Dog: %s, age: %d%n", dog.getName(), dog.getAge());
        System.out.printf("Duck: %s, age: %d%n", duck.getName(), duck.getAge());
        System.out.printf("Tiger: %s, age: %d%n", tiger.getName(), tiger.getAge());

    }
}
