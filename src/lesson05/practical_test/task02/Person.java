package lesson05.practical_test.task02;

/**
 * Created by user on 02.05.2017.
 */
public abstract class Person {
    protected String name;
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
