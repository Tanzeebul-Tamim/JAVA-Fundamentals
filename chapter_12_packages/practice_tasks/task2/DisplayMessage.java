package message;
import java.util.Date;

public class DisplayMessage {
    private String name;

    public DisplayMessage(String name) {
        this.name = name;
    }

    public void display() {
        Date today = new Date();
        System.out.printf("%s,\nDear %s,\n\tLearn Java effectively\n", today, name);
    }
}
