package lesson08.homework.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class HomeWorkMain2 {
    public static void main(String[] args) throws RangeException {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (list.isEmpty()) {
                list.add(ReadNumberMethod.readNumber(1,100));
            }
            else {
                list.add(ReadNumberMethod.readNumber(list.get(i-1),100));
            }
        }
        System.out.println(list);
    }
}
