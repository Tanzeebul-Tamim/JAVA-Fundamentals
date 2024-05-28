package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

import java.util.Scanner;

// Write a program to sum first n even numbers using for loop.

public class Part_25_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 2; i <= n * 2; i += 2) {
            sum += i;
        }

        System.out.printf("The sum of first %d even numbers is %d", n, sum);
    }
}
