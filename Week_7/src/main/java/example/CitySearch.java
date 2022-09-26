package example;

import java.util.Arrays;
import java.util.Scanner;

public class CitySearch {

    public static void run() {

        String search;
        Scanner input = new Scanner(System.in);
        String [] cities =
                {"Melbourne", "Sydney", "Brisbane", "Adelaide", "Perth", "Canberra", "Darwin", "Hobart",
                "Gold Coast", "Cairns"};
        Arrays.sort(cities);

        System.out.println("Enter a city name:");

        for (int i = 0; i < 3; i++) {
            search = input.nextLine();
            System.out.println(search + ", " + Arrays.binarySearch(cities, search,String::compareToIgnoreCase));
            if (Arrays.binarySearch(cities, search,String::compareToIgnoreCase) >= 0) {
                System.out.println("You guessed correctly");
                break;
            } else System.out.println("WRONG!!!");
        }



    }

}
