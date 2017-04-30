package lesson04.homework.task1;

/**
 * Created by user on 27.04.2017.
 */
public class Month {
    public static int getMonthDays(int numbersOfMonth) {
    int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    return month[numbersOfMonth - 1];
    }

}
