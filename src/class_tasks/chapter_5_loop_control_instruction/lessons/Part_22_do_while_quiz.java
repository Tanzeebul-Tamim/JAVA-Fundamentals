package class_tasks.chapter_5_loop_control_instruction.lessons;

import java.util.Scanner;

// Quick quiz: write a program to print first n natural numbers using do-while loop

public class Part_22_do_while_quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How long do you want to print?");
        int n = scanner.nextInt();
        scanner.close();
        int a = 1;

        do {
            System.out.println(a);
            a++;
        } while (a <= n);
    }
}
