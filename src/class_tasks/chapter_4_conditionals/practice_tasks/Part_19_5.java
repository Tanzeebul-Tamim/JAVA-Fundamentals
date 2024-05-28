package class_tasks.chapter_4_conditionals.practice_tasks;

import java.util.Scanner;

// Write a program to find whether a year entered by the user is a leap year or not.

public class Part_19_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the year: ");
        short year = sc.nextShort();
        sc.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
