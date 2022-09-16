import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        int num;
        String month;
        int numdays;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the month to see how many days it has ");
        num = input.nextInt();

        switch (num) {
            case 1:
                month = "January";
                numdays = 31;
                break;
            case 2:
                month = "February";
                numdays = 28;
                break;
            case 3:
                month = "March";
                numdays = 31;
                break;
            case 4:
                month = "April";
                numdays = 30;
                break;
            case 5:
                month = "May";
                numdays = 31;
                break;
            case 6:
                month = "June";
                numdays = 30;
                break;
            case 7:
                month = "July";
                numdays = 31;
                break;
            case 8:
                month = "August";
                numdays = 31;
                break;
            case 9:
                month = "September";
                numdays = 30;
                break;
            case 10:
                month = "October";
                numdays = 31;
                break;
            case 11:
                month = "November";
                numdays = 30;
                break;
            case 12:
                month = "December";
                numdays = 31;
                break;
            default:
                month = "UNKNOWN";
                numdays = 0;
        }

        System.out.println(month + " has " + numdays + " days!");

    }
}
