package lesson03.homework.homework1b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 26.04.2017.
 */
public class HomeWorkMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = 0;
        try {
            System.out.println("How do you want to input numbers?");
            count = sc.nextInt();
        }
        catch (Exception e) {
            System.out.println("Count isn't correct.");
            return;
        }
        System.out.println("Please, input to console " + count + " numbers.");
        for (int i = 0; i < count; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(MinMax.minmax(list));
    }
}
