package class_tasks.chapter_7_methods.practice_tasks;

import java.util.Scanner;

// Write a recursive function to calculate sum of first n natural numbers

public class Part_35_3 {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of n");
        int n = scanner.nextInt();

        scanner.close();

        if (n <= 0) {
            throw new Error("Please enter a positive number");
        }

        int result = sum(n);

        System.out.printf("The summation of first %d numbers is %d", n, result);
    }
}
