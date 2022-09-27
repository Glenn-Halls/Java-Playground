public class ExceptionTester {

    public static void main(String[] args) {

        int[] numArray = new int[3];

        try {
            numArray[1] = 5;
            System.out.println("Still inside try - catch block");
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("An ArrayIOBE error");
        }
        catch (Exception e) {
            System.out.println("\n\nAn exception was caught by the general exception. the exception type was " + e.getClass() + " so you should code an exception type for this");
        }
        finally {
            System.out.println("Finally, cleanup happens here");
        }
        System.out.println("\nOutside try - catch block");

    }
}
