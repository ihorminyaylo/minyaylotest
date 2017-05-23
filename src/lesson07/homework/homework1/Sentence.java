package lesson07.homework.homework1;

/**
 * Created by user on 10.05.2017.
 */
public class Sentence {
    public static String longestWord(String sentence) {
        String maxWord = "";
        String[] words = sentence.split(" ");
        for (String a : words) {
            if (a.length() > maxWord.length()) {
                maxWord = a;
            }
        }
        return maxWord;
    }
    public static int numberOfLetters(String word) {
        return word.length();
    }
    public static String reverseWord(String sentence, int number) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilders = new StringBuilder(words[number - 1]);
        stringBuilders.reverse();
        return stringBuilders.toString();
    }
}
