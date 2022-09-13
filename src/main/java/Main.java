public class Main {

    public static void main(String[] args) {
        boolean knowJava = true;
        System.out.println("The value of knowJava is " + knowJava);

        if (knowJava) {
            System.out.println("I know Java!");
        }

        if (knowJava) System.out.println("I still know Java!!!");

        int myValue = 5;
        System.out.println("My value = " + myValue);

        if (myValue == 5) System.out.println("True!!!");

        if (myValue < 5) {
            System.out.println("this condition is true");
        } else {
            System.out.println("this condition is false");
        }

        if (myValue != 5) {
            System.out.println("this condition is not true");
        } else if (myValue > 5) {
            System.out.println("this condition is not true");
        } else {
            System.out.println("all conditions are false");
        }

        if (myValue > 1) {
            System.out.println("myValue > 1 is true");

            if (myValue <= 5) {
                System.out.println("myValue <= 5 is true");
            }
        }
    }
}
