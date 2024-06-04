package class_tasks.chapter_8_intro_to_oop.practice_tasks;

import java.util.Scanner;

// Create a Class Rectangle with properties: length (double), width(double); methods: initializeSide(double length, double width), calculateArea(), calculatePerimeter(), getLength(), getWidth(), setLength(double length), setWidth(double width); validate that the length and width are positive.

class Rectangle {
    double length;
    double width;

    public void initializeSide(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new Error("Length and width must be a positive value");
        }

        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new Error("Length must be a positive value");
        }

        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new Error("Length of the sides must be positive");
        }

        this.width = width;
    }
}

public class Part_39_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Please enter the length of your rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Please enter the width of your rectangle:");
        double width = scanner.nextDouble();

        rectangle.initializeSide(length, width);

        double area = rectangle.calculateArea();
        System.out.println("The area of the rectangle is " + area);

        double perimeter = rectangle.calculatePerimeter();
        System.out.println("The perimeter of the rectangle is " + perimeter);

        System.out.println("Please enter the updated length of your rectangle:");
        double updatedLength = scanner.nextDouble();
        rectangle.setLength(updatedLength);

        System.out.println("Please enter the updated width of the rectangle:");
        double updatedWidth = scanner.nextDouble();
        rectangle.setWidth(updatedWidth);

        double getLength = rectangle.getLength();
        System.out.println("The updated length of the rectangle is now " + getLength);

        double getWidth = rectangle.getWidth();
        System.out.println("The updated width of the rectangle is now " + getWidth);

        scanner.close();
    }
}
