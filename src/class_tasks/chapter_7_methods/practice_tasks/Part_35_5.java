package class_tasks.chapter_7_methods.practice_tasks;

import java.util.Scanner;

// Write a function to print n-th term of fibonacci series using recursion
/*
 * fibonacci series - 0 1 1 2 3 5 8 13 21
 * = fib(5)
 * = fib(4) + fib(3)
 * = (fib(3) + fib(2)) + (fib(2) + fib(1)) 
 * = ((fib(2) + fib(1)) + 1) + (1 + 0)
 * = ((1 + 0) + 1) + (1 + 0)
 * = 3
 */

public class Part_35_5 {
    static int fibonacci(int n) {
        // if (n == 1) {
        //     return 0;
        // } else if (n == 2) {
        //     return 1;
        // }
        // combining the two conditions

        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the n-th term of fibonacci series using recursion:");
        int n = scanner.nextInt();

        scanner.close();

        System.out.printf("The %dth term of the fibonacci series is %d", n, fibonacci(n));
    }
}
