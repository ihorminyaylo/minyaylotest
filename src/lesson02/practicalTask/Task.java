package lesson02.practicalTask;

/**
 * Created by user on 24.04.2017.
 */
public class Task {
    public static void main(String[] args) {
        Employee gosha = new Employee("Igor", 360, 180);
        System.out.println(gosha.toString());
        gosha.bonuses();
        System.out.println(gosha.bonuses());
    }
}
