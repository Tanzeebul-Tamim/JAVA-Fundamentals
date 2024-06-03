package class_tasks.chapter_7_methods.lessons;

public class Part_33_varargs {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Instead of overloading this method so that it can receive another argument,
    // we can use varargs which returns all the received arguments in an array
    static int sum(int... arr) {
        // we will receive (int ...arr) as (int[] arr;)

        int result = 0;
        for (int elem : arr) {
            result += elem;
        }

        return result;
    }

    // We can enforce at least one argument by specifying the int x variable along
    // with the varargs operator in this case as follows:
    static int sum2(int x, int... arr) {
        int result = x;
        for (int elem : arr) {
            result += elem;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial");

        System.out.println("The sum of 3 and 4 is: " + sum(3, 4));
        System.out.println("The sum of 3, 4 and 5 is: " + sum(3, 4, 5));
        System.out.println("The sum of the numbers 1 to 5 is: " + sum(1, 2, 3, 4, 5));

        // It will return 0 which is the default value for the result variable in this
        // case because we didn't pass any arguments to it
        System.out.println("The sum of nothing is: " + sum());

        // Also works when you pass only one argument
        System.out.println("The sum of 1 is: " + sum(1));

        // At least one argument is required
        System.out.println("At least one argument is required: " + sum2(2));
    }
}
