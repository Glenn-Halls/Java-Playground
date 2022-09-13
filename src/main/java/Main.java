public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 25; i++) {
            System.out.println("the square of " + i + " is " + Math.pow(i,2));
        }

        /*
        1  2  3  4  5  6  7  8  9  10  11  12
        2  4  6  8  10 12 14 16 18 20  22  24
         */

        for (int r = 1; r <= 12; r++) {
            String tableRow = "";
            for (int c = 1; c <= 12; c++) {
                int product = r*c;
                String productString = Integer.toString(product) + "\t";
                tableRow += productString;
            }
            System.out.println(tableRow);
        }
    }
}
