package example;

public class RandomNumber {

    public static void run() {

        int smallest = 100;
        int largest = 1;
        int [] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random() * 100 + 1);
        }

        for (int i = 0; i < randomArray.length; i++) {
            System.out.print("[" + i + "," + randomArray[i] + "] ");
        }

        for (int i = 0; i < randomArray.length; i++) {
            if (smallest > randomArray[i]) {
                smallest = randomArray[i];
            }
            if (largest < randomArray[i]) {
                largest = randomArray[i];
            }
        }

        System.out.println("\n");
        System.out.println("The largest number in the array is: " + largest);
        System.out.println("The smallest number in the array is: " + smallest);

    }

}
