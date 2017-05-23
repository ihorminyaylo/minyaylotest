package lesson07.homework.homework1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by user on 09.05.2017.
 */
public class Homework1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "";
        boolean success = false;
        System.out.println("Input sentence with five words");
        while (!success) {
            sentence = sc.nextLine();
            sentence.trim();
            if (sentence.split(" ").length == 5) {
                success = true;
            }
        }
        // longest word
        String longestWOrd = Sentence.longestWord(sentence);
        System.out.println(longestWOrd);
        // number of its letters
        System.out.println(Sentence.numberOfLetters(longestWOrd));
        // second word in reverse order
        System.out.println(Sentence.reverseWord(sentence, 2));
    }
}
