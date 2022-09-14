package org.example;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        //Step 1: Read number 1
        System.out.print("Please enter number 1: ");
        num1 = input.nextInt();

        //Step 2: Read number 2
        System.out.print("\nPlease enter number 2: ");
        num2 = input.nextInt();

        //Step 3: Compute sum
        sum = num1 + num2;

        //Step 4: Display the sum
        System.out.println("\nThe sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
