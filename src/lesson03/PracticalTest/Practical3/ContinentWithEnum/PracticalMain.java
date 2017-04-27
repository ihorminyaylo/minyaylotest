package lesson03.PracticalTest.Practical3.ContinentWithEnum;

import java.util.Scanner;

/**
 * Created by user on 26.04.2017.
 */
public class PracticalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameCountry = sc.nextLine();
        System.out.println(Continent.getByCountryName(nameCountry));
    }
}
