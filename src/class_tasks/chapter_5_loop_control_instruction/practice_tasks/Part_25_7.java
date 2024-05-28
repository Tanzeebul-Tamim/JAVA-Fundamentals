package class_tasks.chapter_5_loop_control_instruction.practice_tasks;

// Write a program to print the following pattern using while loops
//  ****
//  ***
//  **
//  *

public class Part_25_7 {
    public static void main(String[] args) {
        byte i = 4;

        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println("");
        }
    }
}
