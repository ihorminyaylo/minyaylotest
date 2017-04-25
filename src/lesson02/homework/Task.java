package lesson02.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 22.04.2017.
 */
public class Task {
    public static void main(String[] args) {

        List<Person> listPerson = new ArrayList<>();
        Person gosha = new Person("Igor", LocalDate.of(1995,2,19));
        listPerson.add(gosha);
        Person karina = new Person("Karina", LocalDate.of(1995,7,18));
        listPerson.add(karina);
        Person kolio = new Person("Mykola", LocalDate.of(1995,5,5));
        listPerson.add(kolio);
        Person katya = new Person("Katya", LocalDate.of(1995, 12,9));
        listPerson.add(katya);
        Person artyom = new Person("Artem", LocalDate.of(1995,3,28));
        listPerson.add(artyom);

        // d) 4. Change name of the given person with method "changeName()"
        gosha.changeName("Gosha");

        for (Person person : listPerson) {
            // d) 1. Output how many years to the given person with method "howAge()"
            System.out.println(person.howAge());
        }
        // d) 3. Output information about of the given person with method "output()"
        Person newPerson = Person.input();
        newPerson.output();

    }
}
