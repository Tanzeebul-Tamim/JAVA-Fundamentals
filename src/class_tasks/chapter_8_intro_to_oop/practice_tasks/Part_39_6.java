package class_tasks.chapter_8_intro_to_oop.practice_tasks;

import java.util.Scanner;

// Create a Class Circle with properties: radius (double); methods: initializeRadius(double radius), calculateArea(), calculateCircumference (), getRadius (), setRadius (double length); validate that the radius is positive.

class Circle {
    double radius;

    public void initializeRadius(double radius) {
        if (radius <= 0) {
            throw new Error("Radius must be a positive value");
        }

        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new Error("Radius must be a positive value");
        }

        this.radius = radius;
    }
}

public class Part_39_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("Please enter the length of the radius of your circle:");
        double radius = scanner.nextDouble();

        circle.initializeRadius(radius);

        double area = circle.calculateArea();
        System.out.println("The area f of the circle is " + area);

        double circumference = circle.calculateCircumference();
        System.out.println("The circumference of the circle is " + circumference);

        System.out.println("Please enter the updated radius of the circle:");
        double updatedRadius = scanner.nextDouble();
        circle.setRadius(updatedRadius);

        double getRadius = circle.getRadius();
        System.out.println("The updated radius of the circle is now " + getRadius);

        scanner.close();
    }
}
