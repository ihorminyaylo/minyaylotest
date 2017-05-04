package lesson05.practical_test.task01;

/**
 * Created by user on 02.05.2017.
 */
public class Dog implements Animal {
    private String name;
    Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String voice() {
        return "Woof-woof-woof-woof-woof-woof";
    }
    public String feed() {
        return "Chicken";
    }

    public String getType() {
        return "Dog";
    }

    @Override
    public String toString() {
        return getName();
    }
}
