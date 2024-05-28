package class_tasks.chapter_2_operators_and_expressions.practice_tasks;

// Write a program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

public class Part_12_2 {
    public static void main(String[] args) {
        // Encrypting the grade
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println("Encrypted Grade: " + grade);

        // Decrypting the grade
        grade = (char) (grade - 8);
        System.out.println("Decrypted Grade: " + grade);
    }
}
