package class_tasks.chapter_6_arrays.lessons;

// Multidimensional arrays are arrays of arrays. Each element of a multidimensional array is an array itself.

public class Part_28_multidimensional_arrays {
    public static void main(String[] args) {
        // int[] marks; // 1-D Array

        int[][] flats; // 2-D Array
        // It can be visualized as 2 rows and 3 columns. Or, 2 floors, each with 3 flats
        flats = new int[2][3];

        // Ground floor flat numbers
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;

        // 1st floor flat numbers
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D array elements with for loop
        System.out.println("\nPrinting 2-D array using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }

        String[][][] arr = new String[3][2][3];

        arr[0][0][0] = "apple";
        arr[0][0][1] = "banana";
        arr[0][0][2] = "cherry";

        arr[0][1][0] = "dog";
        arr[0][1][1] = "elephant";
        arr[0][1][2] = "fox";

        arr[1][0][0] = "grape";
        arr[1][0][1] = "honeydew";
        arr[1][0][2] = "kiwi";

        arr[1][1][0] = "lion";
        arr[1][1][1] = "monkey";
        arr[1][1][2] = "newt";

        arr[2][0][0] = "orange";
        arr[2][0][1] = "pear";
        arr[2][0][2] = "quince";

        arr[2][1][0] = "rabbit";
        arr[2][1][1] = "snake";
        arr[2][1][2] = "tiger";

        // Access and print elements in the 3D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("array[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]);
                }
            }
        }
    }
}
