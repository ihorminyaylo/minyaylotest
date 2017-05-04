package lesson05.homework;

/**
 * Created by user on 03.05.2017.
 */
public class Eagle extends FlyingBird {
    public Eagle() {
        this.feathers = true;
        this.layEggs = true;
    }

    @Override
    public String getTypeOfBird() {
        return "Eagle";
    }
}
