package class_tasks.chapter_6_arrays.practice_tasks;

// Write a program to reverse an array

public class Part_29_5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = (int) arr.length / 2;

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int reservedElement = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = element;
            arr[i] = reservedElement;
        }

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
