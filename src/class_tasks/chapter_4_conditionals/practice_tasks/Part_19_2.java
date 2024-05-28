package class_tasks.chapter_4_conditionals.practice_tasks;

import java.util.Scanner;

// Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

public class Part_19_2 {
    public static void marksValidation(int fullMarks, float subjectMarks) {
        if (subjectMarks > fullMarks) {
            throw new Error("Obtained marks cannot be greater than full marks for each subject.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full marks for each subject: ");
        byte fullMark = sc.nextByte();

        System.out.println("Enter your physics marks: ");
        byte physics = sc.nextByte();
        marksValidation(fullMark, physics);

        System.out.println("Enter your chemistry marks: ");
        byte chemistry = sc.nextByte();
        marksValidation(fullMark, chemistry);

        System.out.println("Enter your biology marks: ");
        byte biology = sc.nextByte();

        sc.close();

        marksValidation(fullMark, biology);

        float total = physics + chemistry + biology;

        float fortyPercentOfTotal = 40 * total / 100;
        float thirtyThreePercentPerSub = 33 * fullMark / 100;

        if (total < fortyPercentOfTotal ||
                physics < thirtyThreePercentPerSub ||
                chemistry < thirtyThreePercentPerSub ||
                biology < thirtyThreePercentPerSub) {
            System.out.println("Congratulations! You have successfully failed the exam.");
        } else {
            System.out.println("Congratulations! You have passed the exam.");
        }
    }
}
