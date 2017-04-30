package lesson04.practicaltest.ArrayPractical1;

/**
 * Created by user on 27.04.2017.
 */
public class MethodsOfMas {
    public static int  max(int[] mas) {
        int max = mas[0];
        for (int element : mas) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
    public static int sumPositive(int[] mas) {
        int sum = 0;
        for (int element : mas) {
            if (element > 0) {
                sum += element;
            }
        }
        return sum;
    }
    public static int countOfPlusElementInArray(int[] mas) {
        int count = 0;
        for (int element : mas) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }
    public static String howElementsMore(int[] mas) {
        int countPlus = 0;
        int countMinus = 0;
        for (int element : mas) {
            if (element > 0) {
                countPlus++;
            }
            if (element < 0) {
                countMinus++;
            }
        }
        if (countPlus > countMinus) {
            return "Value of plus more than value of negative";
        }
        else if (countMinus > countPlus) {
            return "Value of minus more than value of positive";
        }
        else {
            return "Value of plus = Value of minus";
        }
    }
}
