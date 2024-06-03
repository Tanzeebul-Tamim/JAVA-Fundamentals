package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

// Write a program to print the following pattern using for loops
//  ****
//  ***
//  **
//  *

public class Part_25_1 {
    public static void main(String[] args) {
        for (byte i = 4; i > 0; i--) {
            for (byte j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
