import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        int n = 0;
        while (n<10) {
            System.out.println("counting... " + (n+1));
            n++;
        }

        System.out.print("\nNow, it's your turn... enter a number here: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("okay then, I will sum all of the integers from 0 to " + num);
        System.out.print("The sum of ");


        int sum = 0;

        int x = 0;
        System.out.print(x);
        while (x <= num) {
            if (x > 0) System.out.print(" + " + x);
            x++;
            sum += x;
        }
        System.out.print(" = " + sum);

    }

}
