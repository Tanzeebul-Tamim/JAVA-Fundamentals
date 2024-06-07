package class_tasks.chapter_10_inheritance.lessons;

// "this" is a way for us to reference an object of the class which is being created / referenced.

// The "super" keyword in Java lets a subclass use methods, fields, and constructors from its parent class, helping with code reuse and correct setup in inheritance.

class Class1 {
    int a;

    public int getA() {
        return a;
    }

    Class1(int a) {
        this.a = a;
    }

    public int returnOne() {
        return 1;
    }
}

class Class2 extends Class1 {
    Class2(int c) {
        super(c);
        System.out.println("I am a constructor");
    }
}

public class Part_47_this_and_super {
    public static void main(String[] args) {
        Class1 e = new Class1(6);
        new Class2(8);

        System.out.println(e.getA());
    }
}
