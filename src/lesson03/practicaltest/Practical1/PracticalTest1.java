package lesson03.practicaltest.Practical1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 25.04.2017.
 */
public class PracticalTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Input amount numbers do you want");
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int number = sc.nextInt();
            list.add(number);
        }
        OddNumber.oddNumrersOutput(list);
    }
}
