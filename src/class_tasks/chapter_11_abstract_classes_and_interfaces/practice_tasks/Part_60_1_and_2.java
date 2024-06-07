package class_tasks.chapter_11_abstract_classes_and_interfaces.practice_tasks;

// 1. Create an abstract class Pen with methods Write() and Refill() as abstract methods
// 2. Use the Pen class to create a concrete class FountainPen with additional method ChangeNib()

abstract class Pen {
    public abstract void write(String text);
    public abstract void refill();
}

class FountainPen extends Pen {
    public void write (String text) {
        System.out.printf("Writing text: \"%s\"\n", text);
    }

    public void refill() {
        System.out.println("Pen has been refilled");
    }

    void ChangeNib() {
        System.out.println("Nib has been replaced");
    }
}

public class Part_60_1_and_2 {
    public static void main(String[] args) {
        FountainPen pilot = new FountainPen();

        pilot.write("My name is Tanzeebul Tamim");
        pilot.refill();
        pilot.ChangeNib();
    }
}
