package lesson05.practical_test.task01;

/**
 * Created by user on 02.05.2017.
 */
public class Cat implements Animal {
    private String name;
    Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String voice() {
        return "Meow-meow-meow-meow-meow";
    }
    public String feed() {
        return "Fish";
    }

    public String getType() {
        return "Cat";
    }

    @Override
    public String toString() {
        return getName();
    }
}
