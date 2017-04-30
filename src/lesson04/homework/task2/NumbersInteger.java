package lesson04.homework.task2;

import java.util.List;

/**
 * Created by user on 27.04.2017.
 */
public class NumbersInteger {
    public static int sum(List<Integer> list) {
        boolean a = false;
        int sum = 0;


        int i = 0;
        while (i < list.size() / 2 && !a) {
            if (list.get(i) < 0) {
                a = true;
            }
            sum += list.get(i);
            i++;
            }
        if (a == true) {
            sum = 0;
            for (i = list.size() / 2; i < list.size(); i++) {
                sum +=list.get(i);
            }
        }
        return sum;
    }
}
