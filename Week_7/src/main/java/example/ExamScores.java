package example;

import java.util.Scanner;

public class ExamScores {

    public static void run() {

        int[] examResults = new int[10];
        int totalScore = 0;
        int averageScore;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter exam scores below:\n\n");

        for (int i = 0; i < examResults.length; i++) {
            System.out.print("Score " + (i+1) + ": ");
            int score = input.nextInt();
            examResults[i] = score;
            totalScore += score;

        }

        averageScore = totalScore / examResults.length;

        System.out.print("\nScores entered are: ");
        for (int i = 0; i < examResults.length -1; i++) {
            System.out.print(examResults[i] + ", ");
        }
        System.out.println("and " + examResults[examResults.length -1] + ".");
        System.out.println("\nTotal score is " + totalScore + " and average score is " + averageScore + ".");

    }
}
