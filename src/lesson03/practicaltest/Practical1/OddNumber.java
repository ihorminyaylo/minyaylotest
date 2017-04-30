package lesson03.practicaltest.Practical1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.04.2017.
 */
public class OddNumber {
    public static List<Integer> oddNumrersOutput(List<Integer> list) {
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                odd.add(list.get(i));
            }
        }
        System.out.println("Odd numbers: ");
        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
        }
        return odd;
    }
}
