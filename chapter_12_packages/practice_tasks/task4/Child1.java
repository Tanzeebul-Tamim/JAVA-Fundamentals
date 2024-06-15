package child;
import parent.Parent;

public class Child1 {
    public void getMessage() {
        System.out.println("I am child 1");

        Parent parent = new Parent();

        //* Attempt to access protected property 'y' which will cause a compilation error
        //* error: y has protected access in Parent
        // System.out.println("I am protected property of Parent class. " + parent.y);

        //* Attempt to access protected method "display" which will cause a compilation error
        //* error: display() has protected access in Parent
        // parent.display();

        //* Attempt to access public method "displayPub" which can be accessed from Child1 class because the method is public
        parent.displayPub();
        System.out.println();
    }
}
