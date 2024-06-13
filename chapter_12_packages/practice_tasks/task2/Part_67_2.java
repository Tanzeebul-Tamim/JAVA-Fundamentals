import java.util.Scanner;
import message.DisplayMessage;

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
