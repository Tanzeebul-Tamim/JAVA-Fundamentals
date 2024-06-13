//* These are built-in (JAVA API) packages
/*
    * Three ways of using built-in packages:
    * 1. import java.util.Scanner;
    * 2. import java.util.*;
    * 3. java.util.Scanner sc = new java.util.Scanner(System.in);
 */

// import java.util.Scanner;

//* with the "*", you import everything that is available in java.util package;
import java.util.*;

public class Part_65_practice_1_creating_packages {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        java.util.Scanner sc2 = new java.util.Scanner(System.in);

        System.out.println("Enter an integer: ");
        int a = sc1.nextInt();
        
        System.out.println("\nEnter another integer:");
        int b = sc2.nextInt();

        System.out.println("\nTaking input from Scanner sc1 " + a);
        System.out.println("Taking input from java.util.Scanner sc2 " + b);

        sc1.close();
        sc2.close();
    }
}
