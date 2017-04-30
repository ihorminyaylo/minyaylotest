package lesson04.practicaltest.ArrayPractical1;

/**
 * Created by user on 27.04.2017.
 */
public class PracticalTestMain {
    public static void main(String[] args) {
        int[] mas = {85, 36, 24, 5, 27, 14, 1, -5, 12, 10};
        System.out.println("Maximum in array = " + MethodsOfMas.max(mas));
        System.out.println("Sum of positive elements in array = " + MethodsOfMas.sumPositive(mas));
        System.out.println("Count of positive elements in array = " + MethodsOfMas.countOfPlusElementInArray(mas));
        System.out.println(MethodsOfMas.howElementsMore(mas));
    }
}
