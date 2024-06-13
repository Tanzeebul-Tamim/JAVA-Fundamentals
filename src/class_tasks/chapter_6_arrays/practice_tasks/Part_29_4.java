package class_tasks.chapter_6_arrays.practice_tasks;

import java.util.Scanner;

// Write a program to add two matrixes of size 2 x 3

public class Part_29_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of the matrixes you want to add:");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns of the matrixes you want to add:");
        int column = sc.nextInt();

        System.out.println();

        if (row <= 0 || column <= 0) {
            sc.close();
            throw new Error("Invalid dimensions. Number of rows and columns must be positive integers.");
        }

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] result = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int elementNo = (i * column + j + 1);
                System.out.printf("Enter the element no %d of matrix 1:", elementNo);
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int elementNo = (i * column + j + 1);
                System.out.printf("Enter the element no %d of matrix 2:", elementNo);
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.print("| ");
            for (int j = 0; j < column; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }

        sc.close();

        /*
         * flats[1][1] = 101; (i - 1 * numberOfColumns) + j -> Calculate the number of
         * element
         * flats[1][2] = 102;
         * flats[1][3] = 103;
         * 
         * flats[2][1] = 201;
         * flats[2][2] = 202;
         * flats[2][3] = 203;
         * 
         * ------------------
         * 
         * flats[0][0] = 101; (i * numberOfColumns) + j + 1 -> Same calculation, but
         * considering that indexes start from 0
         * flats[0][1] = 102;
         * flats[0][2] = 103;
         * flats[0][3] = 103;
         * 
         * flats[1][0] = 201;
         * flats[1][1] = 202;
         * flats[1][2] = 203;
         * flats[1][3] = 203;
         * 
         * flats[2][0] = 201;
         * flats[2][1] = 202;
         * flats[2][2] = 203;
         * flats[2][3] = 203;
         */
    }
}
