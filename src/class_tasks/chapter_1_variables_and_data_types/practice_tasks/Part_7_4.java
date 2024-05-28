package class_tasks.chapter_1_variables_and_data_types.practice_tasks;

import java.util.Scanner;

// Write a program to convert kilometers to miles

public class Part_7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of kilometers: ");
        float kilometers = sc.nextFloat();

        sc.close();

        float miles = kilometers * 0.621371F;
        System.out.println(kilometers + " km is equal to: " + miles + " mi.");
    }
}
