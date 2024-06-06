package class_tasks.chapter_3_strings.lessons;

import java.util.Scanner;

public class Part_13_introduction_to_strings {
    public static void main(String[] args) {
        // * In java, String is a class and not a primitive data type but we can use it
        // like a primitive data type

        // * We can write like this
        String name = new String("Tanzeebul Tamim");
        System.out.println(name);

        // * But String class is used so much that they allowed to write it like a
        // regular data type like this
        String myName = "Tanzeebul Tamim";
        System.out.println(myName);

        // * Strings are immutable and cannot be changed

        // * Different ways to print in Java
        System.out.print("My name is "); // * No new line at the end
        System.out.println(myName); // * Prints a new line at the end
        int a = 611;
        float b = 5.6454f;
        // * %d and %f are called format specifier
        // * %d for int, %f for float, %c for char and %s for string
        // * %2d means, 2 digits before decimal and it will add a space for that
        // * %.2f means 2 digits after decimal
        System.out.printf("The value of a is %2d and value of b is %.2f", a, b);
        // * Same as printf
        System.out.format("\nThe value of a is %d and value of b is %f\n", a, b);

        Scanner sc = new Scanner(System.in);
        // String st = sc.next(); //* Prints only one word
        // System.out.println(st);
        System.out.println("Taking user input: ");
        String st2 = sc.nextLine(); // * Prints the whole input string
        System.out.println(st2);

        sc.close();
    }
}
