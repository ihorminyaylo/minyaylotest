package lesson03.practicaltest.Practical2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.04.2017.
 */
public class OutputOfTreeLang {
    public static void output(int key) {
        List<String> list = new ArrayList<>();
        list.add(English.addMap().get(key));
        list.add(Russian.addMap().get(key));
        list.add(Ukraine.addMap().get(key));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
