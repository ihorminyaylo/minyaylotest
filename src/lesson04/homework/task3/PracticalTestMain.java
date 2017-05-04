package lesson04.homework.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 28.04.2017.
 */
public class PracticalTestMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        boolean success = false;
        System.out.println("Input count of integer numbers");
        int count = ReadNumber.readNumber();
        System.out.println("Input " + count + " numbers");
        while (count > 0) {
            list.add(ReadNumber.readNumber());
            count--;
        }
        System.out.println("Input index of number positive, what you want to out index of condition array");
        while (!success) {
            try {
                int index = ReadNumber.readNumber();
                System.out.println("Index = " + MethodsOfArray.IndexOfPositiveElement(list, index));
                success = true;
            } catch (Exception e) {
                System.out.println("Count of positive elements less introduced index, please, try again");
            }
        }
        System.out.println("Minimum[index, minimum] is " + MethodsOfArray.minOfArray(list));
    }
}
