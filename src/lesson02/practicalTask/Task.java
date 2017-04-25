package lesson02.practicalTask;

/**
 * Created by user on 24.04.2017.
 */
public class Task {
    public static void main(String[] args) {
        Employee gosha = new Employee("Igor", 360, 180);
        Employee kolio = new Employee("Kolya", 250, 50);
        Employee vssya = new Employee("Vasya", 1800, 100);
        System.out.println(kolio);
        System.out.println(gosha);
        System.out.println(vssya);
        kolio.changeRate(500);
        System.out.println(kolio);
        System.out.println(vssya.bonuses());
        System.out.println(Employee.getTotalSum());
        kolio.setHours(100);
        System.out.println(Employee.getTotalSum());
    }
}
