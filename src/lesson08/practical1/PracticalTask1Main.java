package lesson08.practical1;

import java.util.Scanner;

/**
 * Created by user on 12.05.2017.
 */
public class PracticalTask1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input parameters of rectangle(first line - a, second line - b)");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        Rectangle rectangle = new Rectangle();
//        try {
            int s = rectangle.area(a, b);
            System.out.println("Area = " + s);
        /*}*/
        /*catch (NegativeException e) {
            System.out.println(e);
        }*/
    }
}
