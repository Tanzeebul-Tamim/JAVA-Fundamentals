package class_tasks.chapter_7_methods.practice_tasks;

// Write a function to find the average of a set of numbers passed as arguments

public class Part_35_6 {
    static float average(int... numbers) {
        int sum = 0;

        for (int elem : numbers) {
            sum += elem;
        }

        return sum / (float) (numbers.length);
    }

    public static void main(String[] args) {
        float result = average(1, 2, 3, 4, 5);
        System.out.println("The average is " + result);
    }
}
