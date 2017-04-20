package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 18.04.2017.
 * Телефонные звонки из трех разных стран являются стандартными единицами c1, c2 и c3 за минуту.
 * Переговоры продолжались t1, t2 и t3 минут. Сколько компьютеров будет учитываться для каждого вызова отдельно,
 * и все они будут разговаривать друг с другом? Введите все исходные данные с консоли, выполните вычисления и вывод на экран.

 */
//enum Countrie {Ukraine, Poland, Germany, Israel, Canada}
public class Phone {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть назву країни");
        String country = reader.readLine();
        System.out.println("Введіть кількість хвилин з " + country);
        int time = Integer.parseInt(reader.readLine());
        double result = 0;
        Tarif ukraine = new Tarif();
        ukraine.setCountryName("Ukraine");
        ukraine.setTarif(3.85);

        if (country.equals(ukraine.getCountyName())) {
            result = time * ukraine.getTarif();
        }


    }
    public static class Tarif {
        private String countyName;
        private double tarif;
        public void setCountryName(String countyName) {
            this.countyName = countyName;
        }
        public String getCountyName() {
            return countyName;
        }
        public void setTarif(double tarif) {
            this.tarif = tarif;
        }
        public double getTarif() {
            return tarif;
        }
    }
}
