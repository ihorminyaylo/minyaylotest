package lesson03.homework.homework1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26.04.2017.
 */
public class NumbersfRange {
    public static List<String> isNumberOfRange(List<Double> list, double min, double max) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) >= min) && (list.get(i) <= max)) {
                result.add(list.get(i).toString()+ " is of [" + min + " ; " + max + "]");
            }
        }
        return result;
    }
    public static void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
