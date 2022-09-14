package com.test;

public class Cat implements CanSpeak {
    public String petName;
    private int age;

    public Cat() {
        System.out.println("A new instance of Cat was created!");
    }

    public void speak() {
        System.out.println("Meeeeeooowwww!!  says " + petName);
    }

    public int getAge() {
        return age;
    }
}
