package class_tasks.chapter_11_abstract_classes_and_interfaces.lessons;

//* Concrete classes are those which are not abstract. On the other hand, abstract classes are not actual classes but serve as a blueprint for other concrete classes to follow when building objects.

//* An abstract method makes its whole class an abstract class, which means an abstract class must have at least one abstract method and also can contain non abstract methods
//* Objects / instances cannot be made from abstract classes

//* When an abstract class is subclassed, the subclass usually provides implementations for all of the methods in parent(abstract) class. If it doesn't, it must be declared abstract.

//* If a class includes abstract methods, then the class itself must be declared "abstract", as in:
abstract class Parent {
    public Parent() {
        System.out.println("I am the constructor of Parent class");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    //* Abstract method: a method that is declared without an implementation
    public abstract void greet();
    public abstract void greetAgain();
}

//* Child classes derived from an abstract class must either be declared "abstract" or override the "abstract method" 

//* Option-1: Overriding the abstract methods and creating a concrete class
class Child1 extends Parent {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greetAgain() {
        System.out.println("Good morning again");
    }
}

abstract class Child2 extends Parent {
    public void fareWell() {
        System.out.println("See ya later");
    }
}

//* Option-2: Declaring the child class as an abstract method
public class Part_53_abstract_classes_and_methods {
    public static void main(String[] args) {
        //* Abstract classes cannot be instantiated / cannot make objects from abstract classes
        // Parent abstract = new Parent(); // Not Allowed

        Child1 concrete = new Child1(); // Allowed
        concrete.greet();
        concrete.greetAgain();
        concrete.sayHello();

        // Child2 concrete = new Child2(); // Not Allowed as well

        //* We can also assign reference of an abstract class to the object of a concrete subclass (dynamic method dispatch)
        Parent concrete2 = new Child1(); // Allowed
        concrete2.greet();
        concrete2.greetAgain();
        concrete2.sayHello();
    }
}
