package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

import java.util.Scanner;

// Write a program to print multiplication table of a given number

public class Part_25_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number that you want to print the multiplication table of:");
        int n = scanner.nextInt();
        scanner.close();

        System.out.printf("Here's the multiplication table of %d\n", n);

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.printf("%d X %d = %d\n", n, i, result);
        }
    }
}
