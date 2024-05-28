package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

// Write a program to calculate the sum of the numbers occurring in the multiplication table of 8

public class Part_25_8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int result = 8 * i;
            sum += 8 + i + result;
        }

        System.out.printf("The sum of the numbers occurring in the multiplication table of 8 is %d", sum);
    }
}
