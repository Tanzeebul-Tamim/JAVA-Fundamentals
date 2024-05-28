package class_tasks.chapter_1_variables_and_data_types.practice_tasks;

import java.util.Scanner;

// Write a program which asks the user to enter his/her name and greets them with "Hello <name>, have a god day" text.

public class Part_7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        sc.close();

        System.out.println("Hello " + name + ", have a good day.");
    }
}
