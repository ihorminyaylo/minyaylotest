package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

/**
 * Created by user on 18.04.2017.
 */
public class Flower {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(reader.readLine());
        double perimetr = 0;
        double area = 0;
        perimetr = (2 * r * Math.PI);
        area = (Math.PI * r * r);
        System.out.println("Периметр = " + perimetr);
        System.out.println("Площа = " + area);
        reader.close();
    }
}
