import com.test.CanSpeak;
import com.test.Cat;
import com.test.Lynx;

public class Main {

    public static void main(String[] args) {

        Cat pet = new Cat();

        pet.petName = "Henry";
        pet.speak();
        System.out.println(pet.getAge());

        Lynx wildAnimal = new Lynx();
        wildAnimal.petName = "HiJinx";
        wildAnimal.growl();
        wildAnimal.speak();

        Cat stray = new Lynx();

        CanSpeak newPet = new Cat();
        CanSpeak newerPet = new Lynx();

        newerPet.speak();

    }
}
