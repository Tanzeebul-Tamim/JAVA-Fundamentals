package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

import java.util.Scanner;

// Write a program to find factorial of a given number using while loops 

public class Part_25_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number that you want to print the factorial of: ");
        int givenNumber = sc.nextInt();
        sc.close();

        int factorial = 1;
        int i = 1;
        while (i <= givenNumber) {
            factorial *= i;
            i++;
        }

        System.out.printf("The factorial of the number %d is %d", givenNumber, factorial);
    }
}
