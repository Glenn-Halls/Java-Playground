package org.example;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers one below the other");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is the largest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the largest");
        } else {
            System.out.println(number3 + " is the largest");
        }

    }
}
