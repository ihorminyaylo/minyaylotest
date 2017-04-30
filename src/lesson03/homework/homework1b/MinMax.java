package lesson03.homework.homework1b;

import java.util.List;

/**
 * Created by user on 26.04.2017.
 */
public class MinMax {
    public static String minmax(List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return "Minimum is " + min + ". Maximum is " + max + ".";
    }
    public static void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
