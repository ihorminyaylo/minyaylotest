package lesson04.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 27.04.2017.
 */
public class IntegerForTenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Input 10 integer numbers: ");
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Sum = " + NumbersInteger.sum(list));
    }
}
