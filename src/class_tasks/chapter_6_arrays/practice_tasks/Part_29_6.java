package class_tasks.chapter_6_arrays.practice_tasks;

// Write a program to find the maximum element in an array

public class Part_29_6 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 23, 331, 83, 92 };

        int maxElem = arr[0];
        for (int elem : arr) {
            if (elem > maxElem) {
                maxElem = elem;
            }
        }

        System.out.printf("The maximum value that the array holds is %d", maxElem);
    }
}
