package class_tasks.chapter_6_arrays.practice_tasks;

import java.util.Scanner;

// Write a program to find out whether a given integer is present in an array or not

public class Part_29_2 {
    public static void main(String[] args) {
        int[] intArr = { 53, 37, 92, 54, 23 };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int userInput = scanner.nextInt();
        scanner.close();

        boolean givenIntFound = false;

        for (int element : intArr) {
            if (element == userInput) {
                givenIntFound = true;
                break;
            }
        }

        if (givenIntFound) {
            System.out.printf("%d is present in the array", userInput);
        } else {
            System.out.printf("%d is not present in the array", userInput);
        }
    }
}
