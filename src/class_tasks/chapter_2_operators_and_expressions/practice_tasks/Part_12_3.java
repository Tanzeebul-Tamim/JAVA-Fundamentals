package class_tasks.chapter_2_operators_and_expressions.practice_tasks;

import java.util.Scanner;

// Use comparison operators to find out whether a given number is greater than the user entered number or not

public class Part_12_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int userInput = sc.nextInt();

        sc.close();

        System.out.println(userInput > 4);
    }
}
