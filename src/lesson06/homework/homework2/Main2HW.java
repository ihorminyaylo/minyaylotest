package lesson06.homework.homework2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 09.05.2017.
 */

public class Main2HW {
    public static void main(String[] args) {
        Map<String, String> mapOfPerson = new HashMap<>();
        mapOfPerson.put("Veres", "Orest");
        mapOfPerson.put("Galchuk", "Oleg");
        mapOfPerson.put("Jonh", "Michly");
        mapOfPerson.put("Milano", "Orest");
        mapOfPerson.put("Revak", "Orest");
        mapOfPerson.put("Pilot", "Vasiliy");
        mapOfPerson.put("Mihai", "Oleg");
        mapOfPerson.put("Ilai", "Vasiliy");
        mapOfPerson.put("Karo", "Igor");
        mapOfPerson.put("Miro", "Karmel");
        MethodsOfMap.printMap(mapOfPerson);
        System.out.println(MethodsOfMap.equalsValue(mapOfPerson));
        MethodsOfMap.printMap(MethodsOfMap.mapWithoutEqualsValue(mapOfPerson));
    }
}
