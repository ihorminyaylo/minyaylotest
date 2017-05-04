package lesson05.homework;

/**
 * Created by user on 03.05.2017.
 */
public class Swallow extends FlyingBird {
    public Swallow() {
        this.feathers = true;
        this.layEggs = true;
    }

    @Override
    public String getTypeOfBird() {
        return "Swallow";
    }
}
