package parent;

public class Parent {
    String x = "You cannot access me if you belong from a different package.";
    protected String y = "You cannot access me if you belong from a different package, unless you are a subclass inherited from me.";
}
