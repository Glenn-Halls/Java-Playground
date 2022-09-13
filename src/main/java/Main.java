public class Main {

    public static void main(String[] args) {

        if (true || false) {
            System.out.println("only one condition needs to be true");
        }

        if (true && false) {
            System.out.println("this can never be true");
        }

        int myMaxLimit = 20;
        int myMinLimit = 5;

        int myValue = 19;

        if (myValue < myMaxLimit && myValue > myMinLimit) {
            System.out.println("the value " + myValue + " is between " + myMinLimit + " and " + myMaxLimit);
        } else {
            System.out.println("the value " + myValue + " is not between " + myMinLimit + " and " + myMaxLimit);
        }

        int myMaxXLimit = 5;
        int myMinXLimit = 1;
        int myMaxYLimit = 3;
        int myMinYLimit = 1;

        int myXValue = 4;
        int myYValue = 2;

        if ((myXValue < myMaxXLimit && myXValue > myMinXLimit) && (myYValue < myMaxYLimit && myYValue > myMinYLimit)) {
            System.out.println("hooray, x and y are within range!!");
        } else {
            System.out.println("boo, one or both of the x and y values are outside the range");
        }

        boolean myBoolean = false;
        if (!myBoolean) {
            System.out.println("NOT false is true");
        }
    }
}
