package lesson05.practical_test.task02;

/**
 * Created by user on 02.05.2017.
 */
public class Student extends Person {
    public static final String TYPE_PERSON = "student";
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("I am " + name + ". I am " + TYPE_PERSON);
    }
}
