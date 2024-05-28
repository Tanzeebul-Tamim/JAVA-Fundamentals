package class_tasks.chapter_4_conditionals.lessons;

import java.util.Scanner;

public class Part_18_switch_case_statement {
    public static void main(String[] args) {
        int age; // we can use integer, character or string for switch case statements
        System.out.println("Please enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        sc.close();

        // Switch case statement
        // If break isn't used in a switch cases statement, once it matches a case, it
        // will automatically execute all the next cases.
        switch (age) {
            case 18:
                System.out.println("You're gonna be an adult!");
                break; // Terminates the switch (skips the other cases).
            case 23:
                System.out.println("You're gonna get a job!");
                break;
            case 60:
                System.out.println("You're gonna get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }

        // enhanced switch, it doesn't need "break"
        switch (age) {
            // syntax for multiple expressions within a single case
            case 18 -> {
                System.out.println("You're gonna be an adult!");
                System.out.println("You're gonna have lots of responsibilities!");
            }
            case 23 -> System.out.println("You're gonna get a job!");
            case 60 -> System.out.println("You're gonna get retired!");
            default -> System.out.println("Enjoy your life!");
        }
        ;

        // if-else-if-else-ladder
        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced");
        } else {
            System.out.println("You are not experienced!");
        }
    }
}
