package class_tasks.chapter_4_conditionals.practice_tasks;

import java.util.Scanner;

// Calculate income tax paid by an employee to the government as per the slabs mentioned below.
//  Income Slabs    Tax 
//  2.5L-5.0L       5%
//  5.0L-10.0L      20%
//  Above 10.0L     30%
// Note that there is no tax below 2.5L. Take input amount as an input from the user.

public class Part_19_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the income amount in lac: ");

        float income = sc.nextFloat();
        sc.close();

        float tax = 0;

        if (income <= 2.5f) {
            tax = 0;
        } else if (2.5f < income && income <= 5f) {
            tax = 0.05f * (income - 2.5f);
        } else if (5f < income && income <= 10f) {
            tax = 0.05f * (5f - 2.5f);
            tax += 0.2f * (income - 5f);
        } else if (income > 10f) {
            tax = 0.05f * (5f - 2.5f);
            tax += 0.2f * (10f - 5f);
            tax += 0.3f * (income - 10f);
        }

        System.out.println("The amount of the total tax paid by the employee to the government is " + tax + "L");
    }
}
