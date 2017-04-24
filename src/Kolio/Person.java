package Kolio;

import java.time.LocalDate;

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
        int age = LocalDate.now().getYear() - birthDate.getYear();
        return LocalDate.now().getDayOfYear() > birthDate.getDayOfYear() ? age : (age - 1);
    }
    // d) 3. implementation of the method "output()"
    public void output() {
        System.out.println("Name - " + getName());
        System.out.println(getName() + " was born " + getBirthDate());
        System.out.println(getName() + " is " + howAge() + " years old");
    }
    // d) 4. implementation of the method "changeName(String nameWantToChange)"
    public void changeName(String nameWantToChange) {
        if (nameWantToChange != null && !nameWantToChange.isEmpty()) setName(nameWantToChange);
        else {
            System.out.println("Name can't ");
        }
    }

}
