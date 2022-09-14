import com.test.Cat;

public class Main {

    public static void main(String[] args) {

        Cat pet = new Cat();

        pet.petName = "Henry";

        pet.speak();

        System.out.println(pet.getAge());
    }
}
