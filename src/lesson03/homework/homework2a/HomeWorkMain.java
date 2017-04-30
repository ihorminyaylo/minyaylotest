package lesson03.homework.homework2a;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26.04.2017.
 */
public class HomeWorkMain {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        Dog emma = new Dog("Emma", Breed.YORKSHIRE_TERRIER, 2);
        list.add(emma);
        Dog kubic = new Dog("Kubic", Breed.BULLDOG, 5);
        list.add(kubic);
        Dog pushok = new Dog("Pushok", Breed.SHEEPDOG, 10);
        list.add(pushok);
        Dog.printListString(Dog.equalsDogName(list));
        System.out.println(Dog.MaxOldDog(list));
    }
}
