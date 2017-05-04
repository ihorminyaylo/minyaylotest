package lesson05.homework;

/**
 * Created by user on 03.05.2017.
 */
public class Penguin extends NonFlyingBird {
    public Penguin() {
        this.feathers = false;
        this.layEggs = false;
    }

    @Override
    public String getTypeOfBird() {
        return "Penguin";
    }
}
