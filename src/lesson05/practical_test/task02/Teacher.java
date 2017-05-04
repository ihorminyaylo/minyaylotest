package lesson05.practical_test.task02;

/**
 * Created by user on 02.05.2017.
 */
public class Teacher extends Staff {
    public static final String TYPE_PERSON = "teacher";
    public Teacher(String name) {
        this.name = name;
    }
    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + name +" and work as" + TYPE_PERSON + ". My salary is :" + salary());
    }
}
