package class_tasks.chapter_10_inheritance.lessons;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am the base class");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am setting y now");
        this.y = y;
    }

    public void printMe() {
        System.out.println("I am the derived class");
    }
}

public class Part_45_inheritance {
    public static void main(String[] args) {
        // Creating an object of Base class
        Base base = new Base();
        base.setX(4);
        System.out.println(base.getX());

        // Creating an object of Derived class
        Derived derived = new Derived();
        // notice that setX() is a method of the Base class which is the parent class and inherited to Derived class
        derived.setX(5); 
        System.out.println(derived.getX());

        derived.setY(43);
        System.out.println(derived.getY());
    }
}
