package class_tasks.chapter_6_arrays.practice_tasks;

// Create an array of 5 floats and calculate their sum

public class Part_29_1 {
    public static void main(String[] args) {
        float[] arrayFloat = { 5.5f, 3.53f, 9.2f, 53.32f, 36.36f };

        float sum = 0;
        for (float element : arrayFloat) {
            sum += element;
        }

        System.out.format("The sum of the array of 5 floats is %f", sum);
    }
}
