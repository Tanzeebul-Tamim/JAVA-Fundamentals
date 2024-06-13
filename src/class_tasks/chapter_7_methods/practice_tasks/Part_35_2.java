package class_tasks.chapter_7_methods.practice_tasks;

import java.util.Scanner;

// Write a program using functions to print the following pattern
// *
// **
// ***
// ****

public class Part_35_2 {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines for your pattern:");
        int n = sc.nextInt();

        sc.close();

        if (n <= 0) {
            throw new Error("Must be at least one line");
        }

        printPattern(n);
    }
}
