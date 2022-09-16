import java.util.Scanner;


public class OddEven {

    public static void main(String[] args) {

        int number = 0;
        boolean isOdd;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();
        isOdd = (number % 2) == 1;

        if (isOdd) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }

        Ternary test = new Ternary();
        System.out.println(test.ternaryExample(number));

        System.out.println("We can also use inline ternary of " + (number%2 == 0 ? "even" : "odd"));

    }
}
