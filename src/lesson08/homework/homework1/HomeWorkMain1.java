package lesson08.homework.homework1;

import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class HomeWorkMain1 {
    public static void main(String[] args) {
        try {
            System.out.println(MethodDiv.div(10, 0));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
