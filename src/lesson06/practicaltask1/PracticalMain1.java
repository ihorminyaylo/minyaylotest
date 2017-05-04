package lesson06.practicaltask1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 04.05.2017.
 */
public class PracticalMain1 {
    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listOfInteger.add(random.nextInt());
        }
        System.out.println(listOfInteger);
        System.out.println("Collection with elements(index, value) = {(2, 1), (5, -4), (8, -3)} : ");
        MethodForCollection.print(MethodForCollection.addThereeNumbers(listOfInteger));
        System.out.println("Numbers more 5 and result: ");
        MethodForCollection.print(MethodForCollection.numbersMoreFive(listOfInteger)); // Numbers more 5 and print result
        System.out.println("Collection without numbers greater twenty: ");
        MethodForCollection.print(MethodForCollection.numbersGreaterTwentyRemove(listOfInteger)); //Collection without numbers greater twenty
        System.out.println("Collection sort list : ");
        MethodForCollection.print(MethodForCollection.sortList(listOfInteger));
    }
}
