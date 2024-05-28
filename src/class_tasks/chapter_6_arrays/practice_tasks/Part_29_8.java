package class_tasks.chapter_6_arrays.practice_tasks;

import java.util.Arrays;

// Write a program to find whether an array is sorted or not

public class Part_29_8 {
    public static void main(String[] args) {
        int[] arr = { 12, 26, 51, 53, 83, 92 };
        int[] asc = Arrays.copyOf(arr, arr.length);
        int[] desc = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (asc[i] > asc[j]) {
                    int temp = asc[i];
                    asc[i] = asc[j];
                    asc[j] = temp;
                }
                if (desc[i] < desc[j]) {
                    int temp = desc[i];
                    desc[i] = desc[j];
                    desc[j] = temp;
                }
            }
        }

        if (Arrays.equals(arr, asc) || Arrays.equals(arr, desc)) {
            System.out.println("The given array is a sorted array");
        } else {
            System.out.println("The given array is not a sorted array");
        }
    }
}
