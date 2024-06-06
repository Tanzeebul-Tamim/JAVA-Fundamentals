package class_tasks.chapter_9_access_modifiers_constructors.practice_tasks;

// Repeat problem-1 for a sphere

class Sphere {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}

public class Part_44_5 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();

        sphere.setRadius(5);

        System.out.printf("Sphere radius: %d\n", sphere.getRadius());
        System.out.printf("Sphere surface area: %f\n", sphere.getSurfaceArea());
        System.out.printf("Sphere volume: %f\n", sphere.getVolume());
    }
}
