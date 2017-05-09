package lesson06.homework.homework2;

/**
 * Created by user on 05.05.2017.
 */
import lesson06.homework.homework1.MethodsOfSet;
import lesson06.homework.homework2.MethodsOfMap;

import java.util.*;

public class Homework2Main {
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
