package class_tasks.chapter_9_access_modifiers_constructors.practice_tasks;

// Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameter

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 4;
        breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class Part_44_4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.printf("\nRectangle length: %d", rectangle.getLength());
        System.out.printf("\nRectangle breadth: %d", rectangle.getBreadth());

        Rectangle rectangle2 = new Rectangle(9, 7);
        System.out.printf("\nRectangle length: %d", rectangle2.getLength());
        System.out.printf("\nRectangle breadth: %d", rectangle2.getBreadth());
    }
}
