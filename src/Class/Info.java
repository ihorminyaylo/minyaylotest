package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 18.04.2017.
 * Enum
 */

public class Info {
      public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Where are you live, " + name + "?");
        String adress = reader.readLine();
        System.out.println("My name is " + name);
        //System.out.println("I live in " + adress + Color.GREEN);
        reader.close();
    }
}
