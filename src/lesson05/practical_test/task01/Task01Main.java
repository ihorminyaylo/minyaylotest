package lesson05.practical_test.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02.05.2017.
 */
public class Task01Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        Animal pusha = new Cat("Pusha");
        listOfAnimal.add(pusha);
        Animal emma = new Dog("Emma");
        listOfAnimal.add(emma);
        for (Animal animal : listOfAnimal) {
            System.out.println(animal.getType() + " with name: " + animal);
            System.out.println(animal.feed());
            System.out.println(animal.voice());
        }
    }
}
