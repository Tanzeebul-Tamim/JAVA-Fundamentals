package class_tasks.chapter_11_abstract_classes_and_interfaces.practice_tasks;

// Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods. Create another class smartTelephone and demonstrate polymorphism

abstract class Telephone {
    public abstract void ring();
    public abstract void lift();
    public abstract void disconnect();

    public void dial() {
        System.out.println("Dialing...");
    }
}

class SmartTelephone extends Telephone {
    @Override
    public void ring() {
        System.out.println("Ringing...");
    }

    @Override
    public void lift() {
        System.out.println("Lifting...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting...");
    }

    public void checkSMS() {
        System.out.println("Checking sms...");
    }
}

public class Part_60_4 {
    public static void main(String[] args) {
        Telephone tel = new SmartTelephone();
        
        tel.ring();
        tel.lift();
        tel.disconnect();
        tel.dial();
        // tel.checkSMS(); // Not allowed
    }
}
