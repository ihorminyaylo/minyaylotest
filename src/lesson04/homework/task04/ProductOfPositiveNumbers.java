package lesson04.homework.task04;

import lesson04.homework.task3.ReadNumber;

import java.util.List;

/**
 * Created by user on 28.04.2017.
 */
public class ProductOfPositiveNumbers {
    public static int productOfPositiveNumbers(List<Integer> list) {
        int product = 1;
        for (int a : list) {
            product *= a;
        }
        return product;
    }
}
