package lesson08.practical2;

import java.util.Scanner;

/**
 * Created by user on 12.05.2017.
 */
public class PracticalTask2Main {
    public static void main(String[] args) throws ColorException{
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String color = sc.nextLine();
        String type = sc.nextLine();
        Plants plant = new Plants(size, color, type);
        System.out.println(plant);
    }
}
