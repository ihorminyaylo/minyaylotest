package lesson04.homework.task3;

import java.util.Scanner;

/**
 * Created by user on 28.04.2017.
 */
public class ReadNumber {
    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean success = false;
        while (!success) {
            try {
                number = Integer.parseInt(sc.nextLine());
                success = true;
            } catch (Exception e) {
                System.out.println("Number isn't correct, please, try again.");
            }
        }
        return number;
    }
}
