package class_tasks.chapter_10_inheritance.practice_task;

import java.util.Scanner;

// Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as  close to real world scenario as possible

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int[] getLateralFacesAreas() {
        int lateralFaceArea1 = length * height;
        int lateralFaceArea2 = width * height;
        int[] lateralAreas = { lateralFaceArea1, lateralFaceArea2 };

        return lateralAreas;
    }

    public int[] getLateralFacesPerimeters() {
        int lateralPerimeter1 = 2 * (length + height);
        int lateralPerimeter2 = 2 * (width + height);
        int[] lateralPerimeters = { lateralPerimeter1, lateralPerimeter2 };

        return lateralPerimeters;
    }

    public int getVolume() {
        return height * width * length;
    }
}

public class Part_52_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cuboid length:");
        int length = scanner.nextInt();

        System.out.println("\nEnter cuboid width:");
        int width = scanner.nextInt();

        System.out.println("\nEnter cuboid height:");
        int height = scanner.nextInt();

        scanner.close();

        Cuboid cuboid = new Cuboid(length, width, height);

        System.out.printf("\nLength %d m\n", cuboid.getLength());
        System.out.printf("Width %d m\n", cuboid.getWidth());
        System.out.printf("Height %d m\n\n", cuboid.getHeight());

        System.out.printf("Base area perimeter %d m\n", cuboid.getPerimeter());
        System.out.printf("Lateral area perimeter %d m\n", cuboid.getLateralFacesPerimeters()[0]);
        System.out.printf("Lateral area perimeter %d m\n\n", cuboid.getLateralFacesPerimeters()[1]);

        System.out.printf("Base surface area %d m^2\n", cuboid.getArea());
        System.out.printf("Lateral surface area %d m^2\n", cuboid.getLateralFacesAreas()[0]);
        System.out.printf("Lateral surface area %d m^2\n\n", cuboid.getLateralFacesAreas()[1]);

        System.out.printf("Volume %d m^3", cuboid.getVolume());
    }
}
