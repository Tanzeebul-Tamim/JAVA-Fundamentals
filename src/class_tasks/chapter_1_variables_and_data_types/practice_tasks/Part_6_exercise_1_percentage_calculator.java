package class_tasks.chapter_1_variables_and_data_types.practice_tasks;

import java.util.Scanner;

/*
    Exercise-1: Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard (marks are out of 100).
 */

public class Part_6_exercise_1_percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Taking input from user: ");

        System.out.println("Enter the full marks of each subject: ");
        int fullMarks = sc.nextInt();

        System.out.println("Enter marks of subject-1: ");
        float subject1 = sc.nextFloat();
        System.out.println("Enter marks of subject-2: ");
        float subject2 = sc.nextFloat();
        System.out.println("Enter marks of subject-3: ");
        float subject3 = sc.nextFloat();
        System.out.println("Enter marks of subject-4: ");
        float subject4 = sc.nextFloat();
        System.out.println("Enter marks of subject-5: ");
        float subject5 = sc.nextFloat();

        sc.close();

        float totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float average = totalMarks / 5;

        float percentage = (average * 100) / fullMarks;
        System.out.println("The percentage is: " + percentage);
    }
}
