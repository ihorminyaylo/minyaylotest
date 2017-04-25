package lesson02.homework;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by user on 22.04.2017.
 */
public class Person {

    // a) create private fields "name" and "birthDate"
    private String name;
    private LocalDate birthDate;

    // b) properties for access thesse fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // c) 1. default constructor
    public Person() {

    }
    // c) 2. constructor with two parameters
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    // d) 1. implementation of the method "howAge()"
    public int howAge() {
        if (birthDate == null) {
            return 0;
        }
        int age = LocalDate.now().getYear() - birthDate.getYear();
        return LocalDate.now().getDayOfYear() > birthDate.getDayOfYear() ? age : (age - 1);
    }
    // d) 2. implementation of the method "input()"
    public static Person input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        String newName = sc.nextLine();
        try {
            System.out.println("Input birth date");
            LocalDate newDate = LocalDate.parse(sc.nextLine());
            return new Person(newName, newDate);
        }
        catch (Exception e) {
            System.out.println("Date isn't correct.");
            return new Person(newName, null);
        }
    }
    // d) 3. implementation of the method "output()"
    public void output() {
        System.out.println("Name - " + getName());
        if (birthDate != null) {
            System.out.println(getName() + " was born " + getBirthDate());
            System.out.println(getName() + " is " + howAge() + " years old");
        }
    }
    // d) 4. implementation of the method "changeName(String nameWantToChange)"
    public void changeName(String nameWantToChange) {
        if (nameWantToChange != null && !nameWantToChange.isEmpty()) {
            setName(nameWantToChange);
        }
        else {
            System.out.println("Name can't empty");
        }
    }

}
