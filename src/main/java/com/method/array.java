import java.util.ArrayList;

public class array {

    public static void main(String[] args) {

        String[] myArray = new String[] {"Doug", "Mike", "Janet", "Matt"};
        for (String element : myArray) System.out.println(element);

        myArray[0] = "Tim";
        for (String element : myArray) System.out.println(element);

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Rocket");
        myList.add("Scout");
        System.out.println(myList);

        for (String element : myList) System.out.println(element);
        System.out.println(myList.size());

        myList.add(1, "Hoover");
        System.out.println(myList);

        myList.remove("Scout");
        System.out.println(myList);

        myList.remove(1);
        System.out.println(myList);

        int al = myArray.length;
        System.out.println(al);
    }
}
