package class_tasks.chapter_6_arrays.practice_tasks;

// Write a program to find the minimum element in an array

public class Part_29_7 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 23, 331, 83, 92 };

        int minElem = arr[0];
        for (int elem : arr) {
            if (elem < minElem) {
                minElem = elem;
            }
        }

        System.out.printf("The minimum value that the array holds is %d", minElem);
    }
}
