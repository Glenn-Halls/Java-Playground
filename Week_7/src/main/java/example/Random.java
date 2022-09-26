package example;

public class Random {

    public static void run() {

        double rand = Math.random();
        System.out.println(rand);

        int die = (int)(Math.random() * 6) +1;
        System.out.println(die);

    }

}
