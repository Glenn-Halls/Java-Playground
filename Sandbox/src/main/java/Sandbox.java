import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        int age;
        String text;
        Scanner input = new Scanner(System.in);

        for (;;) {
            System.out.print("\n\nEnter your age: ");
            age = input.nextInt();
            if (age > 70) {
                text = "You belong to the Greatest Generation";
            } else if (age > 41) {
                text = "You belong to the Baby Boomers";
            } else if (age > 38) {
                text = "You belong to generation X";
            } else if (age > 21) {
                text = "You belong to generation Y";
            } else if (age > 6) {
                text = "You belong to generation Z";
            } else if (age >= 0) {
                text = "You belong to generation Alpha";
            } else if (age != -1) {
                text = "That is not a valid answer";
            } else break;
            System.out.print(text);
        }
    }
}