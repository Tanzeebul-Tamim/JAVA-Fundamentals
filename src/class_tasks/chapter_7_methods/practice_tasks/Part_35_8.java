package class_tasks.chapter_7_methods.practice_tasks;

import java.util.Scanner;

// Write a function to print the following pattern using recursion
// *
// **
// ***
// ****

/*
 * calls the last step first
 * then recursively calls the first step at the end
 * then prints 1 star (from the first step which was called at the end)
 * then turns back to the previous step and prints 2 stars
 * then turns back to the previous step and prints 3 stars
 * then turns back again and lastly prints 4 stars (from the last step which was called at the beginning)
 * Here are the steps:

 * = printPattern(4)
 * = printPattern(3)
 * = printPattern(2)
 * = printPattern(1)
 * = printPattern(0)
 * 
 * stepping back to resolve the calls
 * 
 * = return (nothing)
 * = *
 * = **
 * = ***
 * = ****
 */

public class Part_35_8 {
    static void printPattern(int n) {
        if (n > 0) {
            printPattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
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
