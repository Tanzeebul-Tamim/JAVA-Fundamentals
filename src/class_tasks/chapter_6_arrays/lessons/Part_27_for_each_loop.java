package class_tasks.chapter_6_arrays.lessons;

public class Part_27_for_each_loop {
    public static void main(String[] args) {
        float[] marksFloat = { 98.1f, 60.2f, 70.3f, 90.4f };
        System.out.println(marksFloat[0]);

        String[] students = { "John", "Mary", "Joe" };
        System.out.println(students.length);

        int[] marksInt = { 100, 60, 70, 90, 86 };
        System.out.println(marksInt.length);

        // Displaying the array (naive way)
        System.out.println("Printing using naive way");
        System.out.println(marksInt[0]);
        System.out.println(marksInt[1]);
        System.out.println(marksInt[2]);
        System.out.println(marksInt[3]);
        System.out.println(marksInt[4]);

        // Displaying the array elements with for loop
        System.out.println("\nPrinting using for loop");
        for (int i = 0; i < marksInt.length; i++) {
            System.out.println(marksInt[i]); // Array traversal
        }

        // Displaying the array elements in reverse order with for loop
        System.out.println("\nPrinting in reverse order using for loop");
        for (int i = marksInt.length - 1; i >= 0; i--) {
            System.out.println(marksInt[i]); // Array traversal
        }

        // Displaying the array elements with for-each loop
        System.out.println("\nPrinting using for-each loop");
        for (int element : marksInt) {
            System.out.println(element);
        }

        // * Note that, in for-each loop, the indexes of the elements are not available,
        // so when you need only the elements, for-each loop is a simpler option. But
        // you can use for loop if you need to work with the indexes of the elements.
    }
}
