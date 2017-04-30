package lesson03.practicaltest.Practical2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 25.04.2017.
 */
public class Russian {
    public static Map<Integer, String> addMap() {
        Map<Integer, String> mapEng = new HashMap<>();
        mapEng.put(1, "Понедельник");
        mapEng.put(2, "Вторник");
        mapEng.put(3, "Среда");
        mapEng.put(4, "Четверг");
        mapEng.put(5, "Пятница");
        mapEng.put(6, "Субота");
        mapEng.put(7, "Воскресение");
        return mapEng;
    }
}
