import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        int num = 1;
        int total = 1;
        Scanner input = new Scanner(System.in);

        do {
            total *= num;
            System.out.println("Enter a number to multiply, or 0 to finish: ");
            num = input.nextInt();
        } while (num != 0);

        System.out.println("The total is: " + total);
    }
}