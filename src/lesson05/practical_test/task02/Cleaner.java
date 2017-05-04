package lesson05.practical_test.task02;

/**
 * Created by user on 02.05.2017.
 */
public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "cleaner";

    public Cleaner(String name) {
        this.name = name;
    }

    @Override
    public int salary() {
        return 1000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + name + " and work as" + TYPE_PERSON + ". My salary is :" + salary());
    }
}
