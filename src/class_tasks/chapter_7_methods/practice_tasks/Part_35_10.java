package class_tasks.chapter_7_methods.practice_tasks;

import java.util.Scanner;

// Write a function to calculate sum of first n natural numbers using iterative approach

public class Part_35_10 {
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of n:");
        int n = scanner.nextInt();

        scanner.close();

        if (n <= 0) {
            throw new Error("Please enter a positive number");
        }

        int result = sum(n);

        System.out.printf("The summation of first %d numbers is %d", n, result);
    }
}
