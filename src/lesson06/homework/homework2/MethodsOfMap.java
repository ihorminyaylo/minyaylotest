package lesson06.homework.homework2;

/**
 * Created by user on 08.05.2017.
 */
import com.sun.javafx.collections.MappingChange;

import java.util.*;
public class MethodsOfMap {
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Last name - " + entry.getKey() + ". First name - " + entry.getValue());
        }
    }
    public static boolean equalsValue(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Map<String, String> mapWithoutEntry = new HashMap<>(map);
            map.remove(entry.getKey());
            if (map.containsValue(entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    public static Map<String, String> mapWithoutEqualsValue(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!entry.getValue().equals("Orest")) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
