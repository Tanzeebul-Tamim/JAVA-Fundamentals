package class_tasks.chapter_1_variables_and_data_types.practice_tasks;

import java.util.Scanner;

// Write a program to detect whether a number entered by the user is integer or not

public class Part_7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Taking user input");
        System.out.println(sc.hasNextInt());
        
        sc.close();
    }
}
