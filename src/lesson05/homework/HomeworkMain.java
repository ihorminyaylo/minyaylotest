package lesson05.homework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 03.05.2017.
 */
public class HomeworkMain {
    public static void main(String[] args) {
        Bird chicken = new Chicken();
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        Bird swallow = new Swallow();
        List<Bird> listOfBirds = Arrays.asList(chicken, eagle, penguin, swallow);
        for (Bird bird : listOfBirds) {
            System.out.println(bird);
        }
        Iterator<Bird> iterator = listOfBirds.iterator();
        listOfBirds.removeIf(bird -> bird instanceof Penguin);
        while (iterator.hasNext()) {
            Bird bird = iterator.next();
            if (bird instanceof Penguin) {
                iterator.remove();
            }
        }
    }
}
