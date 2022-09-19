import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        int levels;
        Scanner input = new Scanner(System.in);

        System.out.print("How many levels should the tree have?: ");
        levels = input.nextInt();

        System.out.println("\n\n\n");

        for (int level = 0; level < levels; level++) {
            String branch = "*";
            String space = "";
            for (int stars = 0; stars < level; stars++) branch += "**";
            for (int spaces = level + 1; spaces < levels; spaces++) space += " ";
            branch = space + branch;

            System.out.println(branch);
        }

    }
}