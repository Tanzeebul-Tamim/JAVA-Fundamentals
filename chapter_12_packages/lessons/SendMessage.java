// package tamims_companions;
package tamim.communicate;

public class SendMessage {
    String message;

    // Method to set the message
    public SendMessage(String message) {
        this.message = message;
    }

    // Method to call the friend and print the message
    public void sendGreetings() {
        System.out.printf("Hello %s! Hope you're enjoying learning java.", message);
    }
}

