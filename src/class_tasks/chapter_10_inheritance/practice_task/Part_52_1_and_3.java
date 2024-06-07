package class_tasks.chapter_10_inheritance.practice_task;

import java.util.Scanner;

// 1. Create a class Circle and use inheritance to create another class Cylinder from it.
// 3. Create methods for area and volume

class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    int height;

    Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double getLateralSurfaceArea() {
        return getPerimeter() * height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

public class Part_52_1_and_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius:");
        int radius = scanner.nextInt();

        System.out.println("\nEnter cylinder height:");
        int height = scanner.nextInt();

        scanner.close();

        Cylinder cylinder = new Cylinder(radius, height);

        System.out.printf("\nRadius %d m\n", cylinder.getRadius());
        System.out.printf("Height %d m\n", cylinder.getHeight());
        System.out.printf("Base area perimeter %.2f m\n\n", cylinder.getPerimeter());
        
        System.out.printf("Base area %.2f m^2\n", cylinder.getArea());
        System.out.printf("Lateral surface area %.2f m^2\n\n", cylinder.getLateralSurfaceArea());

        System.out.printf("Volume %.2f m^3", cylinder.getVolume());
    }
}
