import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        int number;
        int counter = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        do {
            total += counter;
            System.out.print(counter + ", ");
            counter++;
        } while (counter <= number);

        System.out.println("\nTotal = " + total);


    }

}