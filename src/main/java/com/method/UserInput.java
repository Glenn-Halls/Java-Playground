package com.method;

import java.util.Scanner;

public class UserInput {
    public static void userInput() {
//      creates an input dialogue and saves the variable name
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String greeting = "Hello, " + name + "! How are you?";
        System.out.print(greeting);
    }
}
