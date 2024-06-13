package class_tasks.chapter_7_methods.lessons;

import java.util.Scanner;

// Write a program to print the fibonacci series for n terms using recursion.

public class Part_34_recursion_quiz {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        sc.close();

        if (n <= 2) {
            throw new Error("Terms must be greater than 2");
        }

        System.out.println("Fibonacci series for " + n + " terms:");
        printFibonacci(n);
    }
}
