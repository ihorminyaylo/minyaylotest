package lesson03.practicaltest.Practical3.ContinentWithMap;

import lesson03.practicaltest.Practical3.ContinentWithEnum.Continent;

/**
 * Created by user on 26.04.2017.
 */
public class FromNameCountryToNameContinent {
    public static String getContinet(String nameCountry) {
        String a;
        if (nameCountry.equals(Continent.valueOf(nameCountry)) ) {
            //return Continent.valueOf().getNameContinent();
        }
        return null;
    }
}
