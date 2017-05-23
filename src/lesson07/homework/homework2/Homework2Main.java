package lesson07.homework.homework2;

import java.util.Scanner;

/**
 * Created by user on 09.05.2017.
 */
public class Homework2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(MethodWithSpaces.oneSpaces(sentence));
    }
}
