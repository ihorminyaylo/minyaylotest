package lesson03.practicaltest.Practical3.ContinentWithEnum;

/**
 * Created by user on 26.04.2017.
 */
public enum Continent {
    EUROPA("Europe", new String[]{"Ukraine", "Poland", "Romania"}),
    ASIA("Asia", new String[]{"China", "Japan"}),
    SOUTHAMERICA("South America", new String[]{"Brazil", "Argentina"}),
    NORTHAMERICA("North America", new String[]{"USA", "Canada"}),
    AFRICA("Africa", new String[]{"Egypt", "South Africa"}),
    AUSTRALIA("Australia", new String[]{"Australia", "New Zealand"});

    private String nameContinent;
    private String[] countryName;

    public String[] getCountryName() {
        return countryName;
    }

    Continent(String[] countryName) {
        this.countryName = countryName;
    }
    Continent(String nameContinet, String[] countryName) {
        this.nameContinent = nameContinet;
        this.countryName = countryName;
    }

    public String getNameContinent() {
        return nameContinent;
    }
    public static String getByCountryName(String nameInputCountry) {
        String nameInputContinent = null;
        Continent[] mas = Continent.values();
        for (Continent a : mas) {
            for (int i = 0; i < a.getCountryName().length; i++) {
                if (a.getCountryName()[i].equals(nameInputCountry)) {
                    nameInputContinent = a.getNameContinent();
                }
            }
        }
        return nameInputContinent;
    }
}
