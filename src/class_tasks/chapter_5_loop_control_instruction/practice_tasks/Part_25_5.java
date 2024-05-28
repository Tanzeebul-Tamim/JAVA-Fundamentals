package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

import java.util.Scanner;

// Write a program to find factorial of a given number using for loops

public class Part_25_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number that you want to print the factorial of: ");
        int givenNumber = scanner.nextInt();
        scanner.close();

        int factorial = 1;
        for (int i = 1; i <= givenNumber; i++) {
            factorial *= i;
        }

        System.out.printf("The factorial of the number %d is %d", givenNumber, factorial);
    }
}
