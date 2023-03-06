package Lesson2;

import Lesson1.Flyable;
import Lesson1.Illable;
import Lesson1.impl.Cat;
import Lesson1.impl.Dog;
import Lesson1.impl.Duck;
import Lesson1.Animal;
import Lesson1.impl.Eagle;
import veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"));

//        for (Animal a:
//             vetClinic.getAnimals()) {
//               a.getIll();
//        }

        List<Illable> illables = new ArrayList<>();
        illables.add(new Cat("Барсик"));
        illables.add(new Human());

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle());
        flyables.add(new Duck("Donald"));

        for (Flyable f:
             flyables) {
            System.out.println(f.getFlightSpeed());
        }

        Animal.getAnimalsCount();
    }
}
