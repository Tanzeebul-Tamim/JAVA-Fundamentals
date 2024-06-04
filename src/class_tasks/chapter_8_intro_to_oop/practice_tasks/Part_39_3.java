package class_tasks.chapter_8_intro_to_oop.practice_tasks;

import java.util.Scanner;

// Create a Class Square with properties: side (double); methods: initializeSide(double side), calculateArea(), calculatePerimeter(), getSide(), setSide(double side); validate that the side length is positive.

class Square {
    double side;

    public void initializeSide(double side) {
        if (side <= 0) {
            throw new Error("Length of the sides must be a positive value");
        }

        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new Error("Length of the sides must be a positive value");
        }

        this.side = side;
    }
}

public class Part_39_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();

        System.out.println("Please enter the length of the side of your square:");
        double side = scanner.nextDouble();
        square.initializeSide(side);

        double area = square.calculateArea();
        System.out.println("The area of the square is " + area);

        double perimeter = square.calculatePerimeter();
        System.out.println("The perimeter of the square is " + perimeter);

        System.out.println("Please enter the updated length of side of your square:");
        double updatedSide = scanner.nextDouble();
        square.setSide(updatedSide);

        double getSide = square.getSide();
        System.out.println("The updated length of each side of the square is now " + getSide);

        scanner.close();
    }
}
