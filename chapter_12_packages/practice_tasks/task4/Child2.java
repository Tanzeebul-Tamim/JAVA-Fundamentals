package child;
import parent.Parent;

public class Child2 extends Parent {
    public void getMessage() {
        System.out.println("I am child 2");

        //* Attempt to access protected property 'y' which can be accessed from Child2 class because it is a subclass of Parent class
        System.out.println("I am protected property of Parent class. " + y);

        //* Attempt to access protected method "display" which can be accessed from Child2 class because it is a subclass of Parent class
        display();

        //* Attempt to access public method "displayPub" which can be accessed from Child2 class because the method is public
        displayPub();

        
        //* Attempt to access default (package-private) property 'x' which will cause a compilation error
        //* error: x is not public in Parent; cannot be accessed from outside package
        // System.out.println("I am package-private (default) property of Parent class. " + x);
        System.out.println();
    }
}