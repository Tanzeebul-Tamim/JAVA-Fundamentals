package class_tasks.chapter_7_methods.practice_tasks;

import java.util.Scanner;

// Write a function to print the following pattern using recursion
// ****
// ***
// **
// *

public class Part_35_7 {
    static void printPattern(int n) {
        if (n == 1) {
            System.out.print("*");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }

            System.out.println();
            printPattern(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines for your pattern:");
        int n = scanner.nextInt();
        
        scanner.close();
        
        if (n <= 0) {
            throw new Error("Must be at least one line");
        }

        printPattern(n);
    }
}
