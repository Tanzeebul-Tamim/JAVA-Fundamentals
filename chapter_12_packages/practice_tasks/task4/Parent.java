package parent;

public class Parent {
    String x = "You cannot access me if you belong from a different package.";
    protected String y = "You cannot access me if you belong from a different package, unless you are a subclass inherited from me.";

    protected void display() {
        System.out.println("I am the protected method of Parent class.");
    }

    public void displayPub() {
        System.out.println("I am the public method of Parent class.");
    }
}
