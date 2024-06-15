import parent.Parent;

// Prove that you  cannot access default property but can access protected property from the subclass.

class Child1 {
    void getMessage() {
        Parent parent = new Parent();

        //* Attempt to access protected property 'y' which will cause a compilation error
        //* error: y has protected access in Parent
        // System.out.println("I am protected property of Parent class. " + parent.y);
    }
}

class Child2 extends Parent {
    void getMessage() {
        //* Attempt to access protected property 'y' which can be accessed from Child2 class which is a subclass of Parent class
        System.out.println("I am protected property of Parent class. " + y);

        //* Attempt to access default (package-private) property 'x' which will cause a compilation error
        //* error: x is not public in Parent; cannot be accessed from outside package
        // System.out.println("I am package-private (default) property of Parent class. " + x);
    }
}


public class Part_67_4 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        
        child.getMessage();
    }
}
