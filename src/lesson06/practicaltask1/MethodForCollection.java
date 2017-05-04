package lesson06.practicaltask1;

import java.util.*;

/**
 * Created by user on 04.05.2017.
 */
public class MethodForCollection {
    public static List<Integer> numbersMoreFive(List<Integer> list) {
        List<Integer> listMoreFive = new ArrayList<>();
        for (int number : list) {
            if (number > 5) {
                listMoreFive.add(number);
            }
        }
        return listMoreFive;
    }
    public static List<Integer> numbersGreaterTwentyRemove(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number >20) {
                iterator.remove();
            }
        }
        return list;
    }
    public static List<Integer> addThereeNumbers(List<Integer> list) {
        list.set(2, 1);
        list.set(5, -3);
        list.set(8, -4);
        return list;
    }
    public static List<Integer> sortList(List<Integer> list) {
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return list;
    }

    public static void print(List<Integer> list ) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + list.get(i));
        }
    }
}
