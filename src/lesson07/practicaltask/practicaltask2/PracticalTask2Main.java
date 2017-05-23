package lesson07.practicaltask.practicaltask2;

import java.util.Scanner;

/**
 * Created by user on 09.05.2017.
 */
public class PracticalTask2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 10;
        System.out.println("Input surname, name, patronymic on new lines :");
        while (count > 0) {
            try {
                String surename = sc.nextLine();
                String name = sc.nextLine();
                String patronymic = sc.nextLine();
                count = 0;
                Stuff stuff1 = new Stuff(surename, name, patronymic);
                System.out.println(stuff1.surenameAndInitials());
                System.out.println(stuff1.name());
                System.out.println(stuff1.fullName());

            } catch (Exception e) {
                System.out.println("Please, try again.");
                count--;
            }
        }
    }
}
