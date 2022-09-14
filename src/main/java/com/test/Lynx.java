package com.test;

public class Lynx extends Cat implements CanSpeak {
    public Lynx() {
        System.out.println("A new instance of Lynx was created");
    }

    public void growl() {
        System.out.println("Grrrrrrrrrrrr...");
    }
}
