package lesson08.homework.homework2;

import java.util.Scanner;

/**
 * Created by user on 23.05.2017.
 */
public class ReadNumberMethod {
    public static int readNumber(int start, int end) throws RangeException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= start && number <= end) {
            return number;
        } else {
            throw new RangeException();
        }
    }
}

