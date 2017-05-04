package lesson05.homework;

/**
 * Created by user on 02.05.2017.
 */
public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;
    public abstract boolean fly();
    public abstract String getTypeOfBird();
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I am ").append(getTypeOfBird()).append(" ");
        if (feathers) {
            stringBuilder.append("I have feathers. ");
        } else {
            stringBuilder.append("I don't have feathers. ");
        }
        if (layEggs) {
            stringBuilder.append("I can lay eggs. ");
        } else {
            stringBuilder.append("i can't lay eggs. ");
        }
        if (fly()) {
            stringBuilder.append("I can fly. ");
        } else {
            stringBuilder.append("I can't fly. ");
        }
        return stringBuilder.toString();
    }
}
