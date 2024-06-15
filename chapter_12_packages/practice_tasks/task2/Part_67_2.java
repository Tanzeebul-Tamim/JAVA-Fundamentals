import java.util.Scanner;
import message.DisplayMessage;

// Use a built-in package in Java to write a class which prints a message after taking input from the user

public class Part_67_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        sc.close();

        DisplayMessage msg = new DisplayMessage(name);
        msg.display();
    }
}
