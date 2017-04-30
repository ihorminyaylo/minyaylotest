package lesson03.practicaltest.Practical2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 25.04.2017.
 */
public class Ukraine {
    public static Map<Integer, String> addMap() {
        Map<Integer, String> mapEng = new HashMap<>();
        mapEng.put(1, "Понеділок");
        mapEng.put(2, "Вівторок");
        mapEng.put(3, "Середа");
        mapEng.put(4, "Четверг");
        mapEng.put(5, "П'ятниця");
        mapEng.put(6, "Субота");
        mapEng.put(7, "Неділя");
        return mapEng;
    }
}
