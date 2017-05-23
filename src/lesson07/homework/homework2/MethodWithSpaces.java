package lesson07.homework.homework2;

/**
 * Created by user on 10.05.2017.
 */
public class MethodWithSpaces {
    public static String oneSpaces(String sentence) {
        String[] a = sentence.split(sentence);
        String sentence2 = "";
        for (String b : a) {
            b.trim();
            sentence2 += b;
        }
        for (String b : a) {
            sentence2 += b;
        }

        return sentence2;
        //StringBuilder stringBuilder = new StringBuilder(sentence);
    }
}
