package lesson03.homework.homework2a;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26.04.2017.
 */
public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;

    }
    public static List<String> equalsDogName(List<Dog> list) {
        List<String> listequals = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; i < list.size(); j++) {
                if ((list.get(i).name).equals(list.get(j).name)) {
                    listequals.add(list.get(i).getName() + " and " + list.get(j).getName() + " have same name.");
                    break;
                }
            }
        }
        return listequals;
    }
    public static void printListString(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static String MaxOldDog(List<Dog> list) {
        Dog maxOld = list.get(0);
        for (Dog a : list) {
            if (a.getAge() > maxOld.getAge()) {
                maxOld = a;
            }
        }
        return "The oldest dog is " + maxOld.name + ". Breed is " + maxOld.breed.getNameBreed();
    }
}
