public class Main {

    public static void main(String[] args) {

        String[] myArray = new String[] {"Doug", "Mike", "Janet", "Matt"};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Hello, " + myArray[i]);
        }

        for (String element : myArray) {
            System.out.println("Goodbye, " + element);
        }

    }
}
