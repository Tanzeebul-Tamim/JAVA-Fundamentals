import tamim.communicate.SendMessage;
import java.util.Scanner;

public class Part_65_practice_2_using_packages {
    public static void main(String[] args) {
        System.out.println("I am using the user-defined (custom) \"Send Message\" package that I built previously!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        sc.close();

        SendMessage message = new SendMessage(name);
        message.sendGreetings();
    }
}
