package com.java_course.shape;

import java.util.Scanner;

/*
    ***WRITE THIS CODE IN NOTEPAD AND WRITE THE COMMANDS YOU USED IN THE WHOLE PROCESS IN A COMMENT***

    You have to create a package named com.java_course.shape.
    This package should have individual classes for Rectangle, Square, Circle, Cuboid, Cube, Cylinder, Sphere.
    These classes should use inheritance to properly manage the code!
    Include methods like volume, surface area, perimeter, getters and setters for dimensions etc. 
 */

  /*
    * Commands used:

    1. javac -d . .\Part_68_exercise_5_creating_custom_package.java //* for compiling
    2. java com/java_course/shape/Part_68_exercise_5_creating_custom_package //* for executing
 */

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    private int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getLateralSurfaceArea() {
        return getPerimeter() * height;
    }

    public double getSurfaceArea() {
        return 2 * getBaseArea() + getLateralSurfaceArea();
    }

    public double getLateralSurfacePerimeter() {
        return 2 * (getPerimeter() + height);
    }

    public double getVolume() {
        return getBaseArea() * height;
    }
}

class Sphere extends Circle {
    public Sphere(int radius) {
        super(radius);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}

class Cuboid extends Rectangle {
    private int height;

    public Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[] getLateralFacesAreas() {
        int lateralFaceArea1 = getLength() * height;
        int lateralFaceArea2 = getWidth() * height;
        return new int[]{lateralFaceArea1, lateralFaceArea2};
    }

    public int[] getLateralFacesPerimeters() {
        int lateralPerimeter1 = 2 * (getLength() + height);
        int lateralPerimeter2 = 2 * (getWidth() + height);
        return new int[]{lateralPerimeter1, lateralPerimeter2};
    }

    public int getSurfaceArea() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }

    public int getVolume() {
        return getLength() * getWidth() * height;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public int getSide() {
        return getLength();
    }

    public void setSide(int side) {
        setLength(side);
        setWidth(side);
    }
}

class Cube extends Cuboid {
    public Cube(int side) {
        super(side, side, side);
    }

    public void setSide(int side) {
        setLength(side);
        setWidth(side);
        setHeight(side);
    }
}

public class Part_68_exercise_5_creating_custom_package {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Circle
        System.out.print("Enter radius of the circle: ");
        int circleRadius = scanner.nextInt();
        Circle circle = new Circle(circleRadius);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getBaseArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Update Circle
        System.out.print("Enter new radius of the circle: ");
        circleRadius = scanner.nextInt();
        circle.setRadius(circleRadius);
        System.out.println("Updated Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getBaseArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Test Cylinder
        System.out.print("Enter radius of the cylinder: ");
        int cylinderRadius = scanner.nextInt();
        System.out.print("Enter height of the cylinder: ");
        int cylinderHeight = scanner.nextInt();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Base Area: " + cylinder.getBaseArea());
        System.out.println("Lateral Surface Area: " + cylinder.getLateralSurfaceArea());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Volume: " + cylinder.getVolume());

        // Update Cylinder
        System.out.print("Enter new radius of the cylinder: ");
        cylinderRadius = scanner.nextInt();
        System.out.print("Enter new height of the cylinder: ");
        cylinderHeight = scanner.nextInt();
        cylinder.setRadius(cylinderRadius);
        cylinder.setHeight(cylinderHeight);
        System.out.println("Updated Cylinder:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Base Area: " + cylinder.getBaseArea());
        System.out.println("Lateral Surface Area: " + cylinder.getLateralSurfaceArea());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println();

        // Test Sphere
        System.out.print("Enter radius of the sphere: ");
        int sphereRadius = scanner.nextInt();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Sphere:");
        System.out.println("Radius: " + sphere.getRadius());
        System.out.println("Surface Area: " + sphere.getSurfaceArea());
        System.out.println("Volume: " + sphere.getVolume());

        // Update Sphere
        System.out.print("Enter new radius of the sphere: ");
        sphereRadius = scanner.nextInt();
        sphere.setRadius(sphereRadius);
        System.out.println("Updated Sphere:");
        System.out.println("Radius: " + sphere.getRadius());
        System.out.println("Surface Area: " + sphere.getSurfaceArea());
        System.out.println("Volume: " + sphere.getVolume());
        System.out.println();

        // Test Rectangle
        System.out.print("Enter length of the rectangle: ");
        int rectangleLength = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int rectangleWidth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.println("Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Update Rectangle
        System.out.print("Enter new length of the rectangle: ");
        rectangleLength = scanner.nextInt();
        System.out.print("Enter new width of the rectangle: ");
        rectangleWidth = scanner.nextInt();
        rectangle.setLength(rectangleLength);
        rectangle.setWidth(rectangleWidth);
        System.out.println("Updated Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        // Test Cuboid
        System.out.print("Enter length of the cuboid: ");
        int cuboidLength = scanner.nextInt();
        System.out.print("Enter width of the cuboid: ");
        int cuboidWidth = scanner.nextInt();
        System.out.print("Enter height of the cuboid: ");
        int cuboidHeight = scanner.nextInt();
        Cuboid cuboid = new Cuboid(cuboidLength, cuboidWidth, cuboidHeight);
        System.out.println("Cuboid:");
        System.out.println("Length: " + cuboid.getLength());
        System.out.println("Width: " + cuboid.getWidth());
        System.out.println("Height: " + cuboid.getHeight());
        System.out.println("Lateral Faces Areas: " + cuboid.getLateralFacesAreas()[0] + ", " + cuboid.getLateralFacesAreas()[1]);
        System.out.println("Lateral Faces Perimeters: " + cuboid.getLateralFacesPerimeters()[0] + ", " + cuboid.getLateralFacesPerimeters()[1]);
        System.out.println("Surface Area: " + cuboid.getSurfaceArea());
        System.out.println("Volume: " + cuboid.getVolume());

        // Update Cuboid
        System.out.print("Enter new length of the cuboid: ");
        cuboidLength = scanner.nextInt();
        System.out.print("Enter new width of the cuboid: ");
        cuboidWidth = scanner.nextInt();
        System.out.print("Enter new height of the cuboid: ");
        cuboidHeight = scanner.nextInt();
        cuboid.setLength(cuboidLength);
        cuboid.setWidth(cuboidWidth);
        cuboid.setHeight(cuboidHeight);
        System.out.println("Updated Cuboid:");
        System.out.println("Length: " + cuboid.getLength());
        System.out.println("Width: " + cuboid.getWidth());
        System.out.println("Height: " + cuboid.getHeight());
        System.out.println("Lateral Faces Areas: " + cuboid.getLateralFacesAreas()[0] + ", " + cuboid.getLateralFacesAreas()[1]);
        System.out.println("Lateral Faces Perimeters: " + cuboid.getLateralFacesPerimeters()[0] + ", " + cuboid.getLateralFacesPerimeters()[1]);
        System.out.println("Surface Area: " + cuboid.getSurfaceArea());
        System.out.println("Volume: " + cuboid.getVolume());
        System.out.println();

        // Test Square
        System.out.print("Enter side of the square: ");
        int squareSide = scanner.nextInt();
        Square square = new Square(squareSide);
        System.out.println("Square:");
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Update Square
        System.out.print("Enter new side of the square: ");
        squareSide = scanner.nextInt();
        square.setSide(squareSide);
        System.out.println("Updated Square:");
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println();

        // Test Cube
        System.out.print("Enter side of the cube: ");
        int cubeSide = scanner.nextInt();
        Cube cube = new Cube(cubeSide);
        System.out.println("Cube:");
        System.out.println("Side: " + cube.getLength());
        System.out.println("Surface Area: " + cube.getSurfaceArea());
        System.out.println("Volume: " + cube.getVolume());

        // Update Cube
        System.out.print("Enter new side of the cube: ");
        cubeSide = scanner.nextInt();
        cube.setSide(cubeSide);
        System.out.println("Updated Cube:");
        System.out.println("Side: " + cube.getLength());
        System.out.println("Surface Area: " + cube.getSurfaceArea());
        System.out.println("Volume: " + cube.getVolume());
        System.out.println();

        scanner.close();
    }
}
