package class_tasks.chapter_9_access_modifiers_constructors.practice_tasks;

// Create a class Cylinder and use getters and setters to set its radius and height 

class Cylinder {
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

public class Part_44_1 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setHeight(12);
        cylinder.setRadius(9);

        System.out.printf("Cylinder height: %d\n", cylinder.getHeight());
        System.out.printf("Cylinder radius: %d\n", cylinder.getRadius());
    }
}
