package lesson03.practicaltest.Practical2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 25.04.2017.
 */
public class English {

    public static Map<Integer, String> addMap() {
        Map<Integer, String> mapEng = new HashMap<>();
        mapEng.put(1, "Monday");
        mapEng.put(2, "Tuesday");
        mapEng.put(3, "Wednesday");
        mapEng.put(4, "Thursday");
        mapEng.put(5, "Friday");
        mapEng.put(6, "Saturday");
        mapEng.put(7, "Sunday");
        return mapEng;
    }
}
