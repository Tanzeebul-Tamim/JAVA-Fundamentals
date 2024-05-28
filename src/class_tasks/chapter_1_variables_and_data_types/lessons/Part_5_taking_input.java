package class_tasks.chapter_1_variables_and_data_types.lessons;

import java.util.Scanner;

public class Part_5_taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Taking input from the user");
        System.out.println("Enter number 1: ");
        int aInt = sc.nextInt();
        System.out.println("Enter number 2: ");
        int bInt = sc.nextInt();
        int sumInt = aInt + bInt;
        System.out.print("The sum of these numbers is: ");
        System.out.println(sumInt);

        System.out.println("Taking input from the user");
        System.out.println("Enter number 1: ");
        float aFlt = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float bFlt = sc.nextFloat();
        float sumFlt = aFlt + bFlt;
        System.out.print("The sum of these numbers is: ");
        System.out.println(sumFlt);

        boolean b1 = sc.hasNextInt(); // checks if the input is integer or not
        System.out.println(b1);
        boolean b2 = sc.hasNextByte(); // checks if the input is byte or not
        System.out.println(b2);

        String str = sc.next(); // Takes only one word, takes the characters until there's a space
        System.out.println(str);

        String str2 = sc.nextLine(); // Takes the whole input as one string, takes all of it until there's a new line
        System.out.println(str2);

        sc.close();
    }
}