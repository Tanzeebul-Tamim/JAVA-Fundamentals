package class_tasks.chapter_7_methods.lessons;

// Two or more methods can have same name but different parameters. Such methods are called overloaded methods!

// Method overloading cannot be performed by changing the return type of the methods

public class Part_32_method_overloading {
    // Differences between parameter and argument:
    // Here "int a" is a parameter in the 2nd foo method, but when we call the
    // method like this
    // "foo(3000)", here "3000" is the argument.

    static void foo() {
        System.out.println("Good morning bro!");
    }

    static void foo(int a) {
        System.out.println("I love you " + a);
    }

    static void foo(int a, int b) {
        System.out.println("Hello there " + a);
        System.out.println("Hey there " + b);
    }
    
    //* Cannot be performed by changing the return type
    // static int foo(int a, int b) {
    //     return a + b;
    // }

    public static void main(String[] args) {
        // When an argument was passed, java automatically understood that which foo
        // method to call.
        foo();
        foo(3000); // Arguments are actual values
        foo(3000, 4000);
    }
}
