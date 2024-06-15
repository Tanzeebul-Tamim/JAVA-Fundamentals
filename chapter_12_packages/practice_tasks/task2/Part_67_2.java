package message; //* User-defined(Custom Package)

//* Built-in packages
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

// Use built-in packages in Java to write a class which prints a message after taking input from the user

/*
    * Commands used:

    1. javac -d . .\Part_67_2.java //* for compiling
    2. java message/Part_67_2 //* for executing
 */

class DisplayMessage {
    private String name;

    public DisplayMessage(String name) {
        this.name = name;
    }

    public void display() {
        Date today = new Date();

        //* Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");

        //* Format the date
        String formattedDate = formatter.format(today);

        System.out.printf("\n%s,\nDear %s,\n\tLearn Java effectively\n", formattedDate, name);
    }
}

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
