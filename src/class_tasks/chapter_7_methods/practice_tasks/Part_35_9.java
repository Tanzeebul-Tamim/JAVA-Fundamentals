package class_tasks.chapter_7_methods.practice_tasks;

// Write a function to convert celsius temperature into fahrenheit

public class Part_35_9 {
    static float convertTemp(float celsius) {
        float fahrenheit = celsius * (9 / 5f) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        float celsius = 5;
        System.out.printf("%f°C = %f°F", celsius, convertTemp(celsius));
    }
}
