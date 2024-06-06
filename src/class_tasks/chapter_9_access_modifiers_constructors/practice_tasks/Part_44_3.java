package class_tasks.chapter_9_access_modifiers_constructors.practice_tasks;

// Use a constructor and repeat problem-1

class Cylinder2 {
    private int radius;
    private int height;

    public Cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}

public class Part_44_3 {
    public static void main(String[] args) {
        Cylinder2 cylinder2 = new Cylinder2(8, 5);
        
        System.out.printf("Cylinder radius:%d\n", cylinder2.getRadius());
        System.out.printf("Cylinder height: %d\n", cylinder2.getHeight());
    }
}
