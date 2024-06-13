package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

import java.util.Scanner;

// Write a program to sum first n even numbers using while loop.

public class Part_25_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the value of n:");
        int n = sc.nextInt();
        sc.close();

        int i = 2;
        int sum = 0;
        while (i <= n * 2) {
            sum += i;
            i += 2;
        }

        System.out.printf("The sum of first %d even numbers is %d", n, sum);
    }
}
