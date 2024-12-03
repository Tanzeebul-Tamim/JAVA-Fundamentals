package class_tasks.chapter_9_access_modifiers_constructors.lessons;

/*
  Constructor Chaining:
  Constructor chaining is the process of calling one constructor from another constructor within the same class or across different classes in an inheritance hierarchy.

  - this() is used to call another constructor in the same class.
  - super() is used to call a constructor from the immediate parent class.

  Rules:
  1. If you use `this()` or `super()` in a constructor, it must be the first statement.
  2. Constructor chaining ensures that all necessary initialization logic is executed in a structured way.
*/

class Base {
    Base() {
        System.out.println("I am the default constructor of Base class.");
    }

    Base(String message) {
        System.out.println("I am the overloaded constructor of Base class with message: " + message);
    }
}

class Intermediate extends Base {
    Intermediate() {
        super("Hello from Intermediate class"); // Calls the parameterized constructor of Base
        System.out.println("I am the default constructor of Intermediate class.");
    }

    Intermediate(String message) {
        this(); // Calls the default constructor of Intermediate
        System.out.println("I am the overloaded constructor of Intermediate class with message: " + message);
    }
}

class Final extends Intermediate {
    Final() {
        super("Hello from Final class"); // Calls the parameterized constructor of Intermediate
        System.out.println("I am the default constructor of Final class.");
    }

    Final(String message) {
        this(); // Calls the default constructor of Final
        System.out.println("I am the overloaded constructor of Final class with message: " + message);
    }
}

public class Part_42_2_constructor_chaining {
    public static void main(String[] args) {
        /*
            Constructor chaining example: When creating an object: - Constructors are called from the top of the hierarchy (Base class) to the bottom (Final class). - Depending on how `this()` and `super()` are used, different constructors in the hierarchy are executed.
         */

        System.out.println("1. Creating Base class instance:");
        new Base();
        System.out.println();

        System.out.println("2. Creating Intermediate class instance with default constructor:");
        new Intermediate();
        System.out.println();

        System.out.println("3. Creating Intermediate class instance with parameterized constructor:");
        new Intermediate("Intermediate's parameterized constructor invoked!");
        System.out.println();

        System.out.println("4. Creating Final class instance with default constructor:");
        new Final();
        System.out.println();

        System.out.println("5. Creating Final class instance with parameterized constructor:");
        new Final("Final's parameterized constructor invoked!");
        System.out.println();
    }
}
