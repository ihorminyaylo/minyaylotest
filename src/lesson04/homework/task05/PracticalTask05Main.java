package lesson04.homework.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 30.04.2017.
 */
public class PracticalTask05Main {
    public static void main(String[] args) {
        int yearBuiltOfCar = 0;
        List<Car> listCar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Car honda = new Car("Honda Civic", 2008, 450);
        listCar.add(honda);
        Car toyota = new Car("Toyota Camry", 2008, 400);
        listCar.add(toyota);
        Car lexus = new Car("Lexus RX 450", 2009, 350);
        listCar.add(lexus);
        Car mitsubishi = new Car("Mitsubishi Lancer", 2013, 430);
        listCar.add(mitsubishi);
        System.out.println("Trimming cars by years" + Car.sortCarOfYear(listCar));
        System.out.println("Input year of built car you want to out. If you want to exit - input \"exit\"");
        while (true) {
            try {
                String text = sc.nextLine();
                if (text.equals("exit")) {
                    break;
                }
                yearBuiltOfCar = Integer.parseInt(text);
            } catch (Exception e) {
                System.out.println("Your data isn't correct. Please, try again. If you want to exit - input \"exit\"");

            }
        }
        List<Car> listResultCar = Car.carOfYear(listCar, yearBuiltOfCar);
        if (listResultCar.isEmpty()) {
            System.out.println("There are no such cars\n");
        } else {
            System.out.println("All cars with date of built = " + yearBuiltOfCar + " " + listResultCar);
        }
    }
}
