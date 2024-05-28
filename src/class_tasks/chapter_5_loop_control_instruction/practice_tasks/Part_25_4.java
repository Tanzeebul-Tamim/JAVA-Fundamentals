package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

// Write a program to print multiplication table of 10 in reverse order

public class Part_25_4 {
    public static void main(String[] args) {
        System.out.println("Here's the multiplication table of 10 in reverse order\n");

        for (int i = 10; i > 0; i--) {
            System.out.printf("10 X %d = %d\n", i, 10 * i);
        }
    }
}