package lesson06.homework.homework1;

import lesson06.homework.homework1.MethodsOfSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 05.05.2017.
 */
public class Homework1Main {
    public static void main(String[] args) {
        Set<Integer> setOfInteger1 = new HashSet<>();
        setOfInteger1.add(5);
        setOfInteger1.add(10);
        setOfInteger1.add(100);
        setOfInteger1.add(-10);
        Set<Integer> setOfInteger2 = new HashSet<>();
        setOfInteger2.add(3);
        setOfInteger2.add(6);
        setOfInteger2.add(5);
        setOfInteger2.add(10);
        MethodsOfSet twoList = new MethodsOfSet();
        System.out.println(twoList.unionSet(setOfInteger1,setOfInteger2));
        System.out.println(twoList.intersect(setOfInteger1, setOfInteger2));
    }
}
