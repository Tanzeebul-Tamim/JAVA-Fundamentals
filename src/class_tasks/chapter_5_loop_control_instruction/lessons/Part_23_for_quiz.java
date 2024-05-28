package class_tasks.chapter_5_loop_control_instruction.lessons;

import java.util.Scanner;

// Quick quiz:
// 1. Write a program to print first n odd numbers using a for loop
// 2. Write a program to print first n natural numbers in reverse order using for loop

public class Part_23_for_quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print first first n odd numbers");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println('\n');

        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }

        System.out.println("\n Printing first n natural numbers in reverse order");

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
