package class_tasks.chapter_6_arrays.practice_tasks;

// Calculate the average marks from an array containing marks of all students in Physic using for-each loop

public class Part_29_3 {
    public static void main(String[] args) {
        int[] marks = { 34, 53, 62, 92, 32 };

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        float average = sum / (float) (marks.length);

        System.out.printf("The average marks of the students in Physics is %f", average);
    }
}
