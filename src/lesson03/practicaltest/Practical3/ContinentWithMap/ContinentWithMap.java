package lesson03.practicaltest.Practical3.ContinentWithMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 26.04.2017.
 */
public class ContinentWithMap {
    public ArrayList<String> key() {
        ArrayList<String> asiaKey = new ArrayList<>();
        asiaKey.add("Japan");
        return asiaKey;
    }
    public Map<ArrayList, String> info() {
        Map<ArrayList, String> map = new HashMap<>();
        map.put(key(), "Asia");
        return map;
    }
    public String nameContinent(String nameCountry) {
       // if (nameCountry.equals(info().get(key().)))
        return null;
    }
}
