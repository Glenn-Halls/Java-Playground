package example;

import java.util.Scanner;

public class ExamScores2D {

    public static void run() {

        int[][] scores = new int[4][4];
        Scanner input = new Scanner(System.in);

        // Create grid with all but average input by user
        for (int i = 0; i < scores.length; i++) {
            System.out.println("\nPlease enter details for student number " + (i + 1) + ":");
            for (int j = 0; j < scores[i].length -1; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Student ID: ");
                        break;
                    case 1:
                        System.out.print("Exam 1 score: ");
                        break;
                    case 2:
                        System.out.print("Exam 2 score: ");
                    default:
                        break;
                }

                scores[i][j] = input.nextInt();

            }
        }

        // Calculate average into average field
        for  (int i = 0; i < scores.length; i++) {
            scores[i][3] = (scores[i][1] + scores[i][2]) / 2;
        }
        System.out.print("\n\n\n");

        // Display grid
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("ID: ");
                        break;
                    case 1:
                        System.out.print("Exam 1: ");
                        break;
                    case 2:
                        System.out.print("Exam 2: ");
                        break;
                    case 3:
                        System.out.print("Average Score: ");
                        break;
                    default:
                        break;
                }
                System.out.print(scores[i][j] + "         ");
            }
            System.out.println();
        }

    }
}

