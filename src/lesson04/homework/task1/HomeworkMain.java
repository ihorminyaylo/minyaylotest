package lesson04.homework.task1;

import java.util.Scanner;

/**
 * Created by user on 27.04.2017.
 */
public class HomeworkMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input month");
        int month = sc.nextInt();
        System.out.println("Days of " + month + " month = " + Month.getMonthDays(month));

    }
}
