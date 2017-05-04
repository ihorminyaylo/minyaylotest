package lesson04.homework.task04;

import lesson04.homework.task3.ReadNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 28.04.2017.
 */
public class PracticalMain {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        int number = 0;
        System.out.println("Input numbers, if you input negative number, input console is end");
        while (true) {
            number = ReadNumber.readNumber(); //This method in task3
            if (number < 0) {
                break;
            }
            list.add(number);
        }
        System.out.println("Product of positive numbers with = \"0\" " + ProductOfPositiveNumbers.productOfPositiveNumbers(list));
    }
}
