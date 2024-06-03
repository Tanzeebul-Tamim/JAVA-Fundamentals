package class_tasks.chapter_7_methods.lessons;

import java.util.Scanner;

// A function can call itself. Such calling of function by itself is called recursion

public class Part_34_recursion {
    // factorial(n) = n * n - 1 * n - 2 * ..... 1
    // factorial(n) = n * factorial(n - 1)
    // factorial(5) = 5 * 4 * 3 * 2 * 1
    // factorial(0) = 1

    static int factorial_recursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial_recursive(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;

            for (int i = 1; i <= n; i++) {
                product *= i;
            }

            return product;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for which you want to find the factorial: ");
        int x = scanner.nextInt();
        scanner.close();

        System.out.println("Using recursive method, the value of factorial x is: " + factorial_recursive(x));
        System.out.println("Using iterative method, the value of factorial x is: " + factorial_iterative(x));
    }
}
