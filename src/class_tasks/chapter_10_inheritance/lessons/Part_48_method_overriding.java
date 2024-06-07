package class_tasks.chapter_10_inheritance.lessons;

/*
    Method overriding occurs when a child class defines a method with the same name, parameters and return type as a method in its parent class. This allows the child class to redefine the parent class's method in the child class. For the child class to access the parent class's method, it cannot be private; it must have protected or higher access (such as public).
*/

class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am the method 2 of class A");
    }
}

class B extends A {
    /*
        The @Override annotation in Java indicates that a method is intended to override a method in a superclass. It helps catch errors at compile time by ensuring the method correctly overrides a method in the parent class.
     */
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

public class Part_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
