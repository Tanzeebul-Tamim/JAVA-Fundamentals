package class_tasks.chapter_6_arrays.lessons;

public class Part_26_introduction_to_arrays {
    public static void main(String[] args) {
        // Classroom of 5 students. You have to store marks of these 5 students
        // Option-1: create 500 variables
        // Option-2: use array (recommended)
        // Array is an object,which is a collection of similar types of data

        // * There're 3 main ways to create an array in Java

        // Option-1: Declaration + Memory allocation, then initialization
        int[] marksOfClass1 = new int[5];

        // Initialization
        marksOfClass1[0] = 100;
        marksOfClass1[1] = 60;
        marksOfClass1[2] = 70;
        marksOfClass1[3] = 90;
        marksOfClass1[4] = 86;

        // Option-2: Declaration, then memory allocation, and then initialization
        int[] marksOfClass2; // Declaration
        marksOfClass2 = new int[5]; // Memory allocation

        // Initialization
        marksOfClass2[0] = 100;
        marksOfClass2[1] = 60;
        marksOfClass2[2] = 70;
        marksOfClass2[3] = 90;
        marksOfClass2[4] = 86;

        // Option-3: Declare + Memory Allocation + Initialize, all together
        int[] marksOfClass3 = { 100, 60, 70, 90, 86 };

        // Access and print array elements
        System.out.println(marksOfClass1[2]);
        System.out.println(marksOfClass2[3]);
        System.out.println(marksOfClass3[4]);

        // * Note that, array indices start from 0 and goes till (n-1) where n is the
        // size of the array
    }
}
