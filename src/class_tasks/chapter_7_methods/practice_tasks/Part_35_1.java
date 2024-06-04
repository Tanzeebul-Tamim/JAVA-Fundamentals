package class_tasks.chapter_7_methods.practice_tasks;

import java.util.Scanner;

// Write a Java method to print multiplication table of a number n

public class Part_35_1 {
    static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of which you want to see the multiplication table of:");
        int n = scanner.nextInt();

        scanner.close();

        if (n <= 0) {
            throw new Error("Please enter a positive number!");
        }

        multiplicationTable(n);
    }
}
