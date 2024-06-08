package class_tasks.chapter_7_methods.lessons;

public class Part_31_methods_in_java {
    //* Part-1

    static int staticLogic(int x, int y) {
        int z;

        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }

        return z;
    }

    int logic(int x, int y) {
        int z;
        z = (x * y) / 5;

        return z;
    }

    // ----------------------------------------------

    //* Part-2

    /*
     * Static keyword is used to associate a method of a given class with the class
     * rather than the object. Static method in a class is shared by all the
     * objects. In this case, tellJoke method is shared among all the objects of
     * class Part_31_methods_in_java
     */

    /*
     * When we don't want our method to return anything, we use void as the return
     * type
     */
    static void tellJoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    static void change(int a) {
        a = 98; // Copy of the variable, passed as an argument
    }

    static void change2(int[] arr) {
        arr[0] = 98; // Reference of the actual object is passed as the argument
    }

    public static void main(String[] args) {
        //* Part-1

        int a1 = 5;
        int b1 = 7;
        int c1;

        c1 = staticLogic(a1, b1);

        System.out.println("This static logic method " + c1);

        int a2 = 2;
        int b2 = 1;
        int c2;

        // Static methods can be called directly
        c2 = staticLogic(a2, b2);

        System.out.println("This static logic method " + c2);

        int a3 = 12;
        int b3 = 31;
        int c3;

        // A method can be called by creating an object of the class
        // (Part_31_methods_in_java in this case) in which the method exists followed by
        // the method call
        // You need to call a method through object creation if the method is not static
        // Method invocation using Object creation
        Part_31_methods_in_java obj = new Part_31_methods_in_java(); // Object creation
        c3 = obj.logic(a3, b3); // Method call upon an object

        System.out.println("This is logic method " + c3);

        // -------------------------------------

        //* Part-2

        tellJoke();

        // Case-1: checking if methods modify the original values of the variables
        // passed to it as arguments or not.

        // Methods don't modify the original values of the variables passed to the
        // method as arguments. Because when the value is passed as an argument, the
        // value becomes a copy of the actual variable. So the real one remains
        // unchanged.
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: " + x);

        // Case-2: checking if methods modify the original values of the elements of an
        // array passed to it as arguments or not.

        // Objects are stored in memory as references. Here a specified memory is
        // allocated for the variable marks and the variable refers to that memory
        // location. When we modify the array or pass it into an method as an argument,
        // the reference of the original array is actually passed, and thus when the
        // array is modified in the method, it really modifies the original array using
        // the reference of that array
        int[] marks = { 52, 73, 77, 89, 98, 94 };
        change2(marks);
        System.out.println("The value of the first element of the array marks after running change2 is: " + marks[0]);
    }
}
