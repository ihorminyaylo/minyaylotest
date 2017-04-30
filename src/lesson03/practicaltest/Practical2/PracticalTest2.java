package lesson03.practicaltest.Practical2;

import java.util.Scanner;

/**
 * Created by user on 25.04.2017.
 */
public class PracticalTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean succses = false;
        System.out.println("Input number of the week(from 1 to 7)");
        while (!succses) {
            try {
                int numberOfWeek = sc.nextInt();
                if (numberOfWeek > 7 || numberOfWeek < 1) {
                    throw new Exception();
                }
                succses = true;
                OutputOfTreeLang.output(numberOfWeek);
            } catch (Exception e) {
                System.out.println("You input don't correct num");
            }
        }
    }
}
