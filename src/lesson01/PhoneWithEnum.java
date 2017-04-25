package lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 20.04.2017.
 */
public class PhoneWithEnum {
    enum Country {
        UKRAINE(3.85, "uah"), USA(10, "usd"), CANADA(12.5, "usd"), GERMANY(20, "eu");

        double tarif;
        String curency;

        Country(double tarif, String curency) {
            this.tarif = tarif;
            this.curency = curency;
        }

        public double getTarif() {
            return tarif;
        }
        public String getCurency() {
            return curency;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть назву країни(великими літерами)");
        String countryName = reader.readLine();
        Country country = Country.valueOf(countryName);
        System.out.println("Введіть кількість хвилин з " + countryName);
        int time = Integer.parseInt(reader.readLine());
        double result = time * country.getTarif();
        System.out.println("Ви витратили : " + result + " " + country.getCurency());

    }
}
