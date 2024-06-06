package class_tasks.chapter_9_access_modifiers_constructors.practice_tasks;

// Use solution to problem-1 to calculate surface area, lateral area and volume of the cylinder

public class Part_44_2 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(9);
        cylinder.setHeight(12);

        int height = cylinder.getHeight();
        int radius = cylinder.getRadius();

        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralSurfaceArea = 2 * Math.PI * radius * height;
        double totalSurfaceArea = 2 * baseArea + lateralSurfaceArea;
        double volume = baseArea * height;

        System.out.printf("Cylinder base area: %f\n", baseArea);
        System.out.printf("Cylinder lateral surface area: %f\n", lateralSurfaceArea);
        System.out.printf("Cylinder total surface area: %f\n", totalSurfaceArea);
        System.out.printf("Cylinder volume: %f\n", volume);
    }
}
