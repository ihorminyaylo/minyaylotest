package lesson05.practical_test.task02;

import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 03.05.2017.
 */
public class TaskMain {
    public static void main(String[] args) {
        Person vasya = new Student("Vasya");
        Person kolya = new Teacher("Kolya");
        Person misha = new Cleaner("Misha");
        List<Person> listOfPerson = Arrays.asList(vasya, kolya, misha);
        for (Person person : listOfPerson) {
            person.print();
        }
        for (Person person : listOfPerson) {
            if (person instanceof Staff) {
                System.out.println(person.getName() + " has salary " + ((Staff) person).salary());
            }
        }
    }
}
