package class_tasks.chapter_10_inheritance.lessons;

/*
  When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class.
  If we want to call the constructor with parameters of the parent class from the child class, we can use the "super" keyword to pass the arguments to the parent class.
 */

class Parent {
    Parent() {
        System.out.println("I am a constructor of parent class");
    }

    Parent(int a) {
        System.out.println("I am an overloaded constructor of parent class with value of a as: " + a);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("I am a constructor of child class");
    }

    Child(int a, int b) {
        super(a);
        System.out.println("I am an overloaded constructor of child class with value of b as:" + b);
    }
}

class GrandChild extends Child {
    GrandChild() {
        System.out.println("I am a constructor of grand child class");
    }

    GrandChild(int a, int b, int c) {
        super(a, b);
        System.out.println("I am an overloaded constructor of grand child class with value of c as:" + c);
    }
}

public class Part_46_constructors_in_inheritance {
    public static void main(String[] args) {
        /*
         * If a derived class doesn't have a constructor, it'll automatically call the
         * constructor of the base/parent class.
         * 
         * If a derived class has a constructor, first the constructor of the base class
         * will be called and then the constructor of the derived class will be called.
         */

        new Parent();
        new Parent(1);
        System.out.println();

        new Child();
        new Child(2, 3);
        System.out.println();

        new GrandChild();
        new GrandChild(4, 5, 6);
        System.out.println();
    }
}