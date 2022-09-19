import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        int number;
        int total = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int counter = 1; counter <= number; counter++) {
            total += counter;
            System.out.print(counter);
        }

        average = total / (double)number;

        System.out.println("The total of the numbers from 1 to " + number +  " is " + total + " and the average is " + average);
    }
}