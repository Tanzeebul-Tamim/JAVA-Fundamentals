import child.Child1;
import child.Child2;

// Prove that you  cannot access default property but can access protected property from the subclass.

 /*
    * Commands used:

    1. javac -d . *.java //* for compiling
    2. java Part_67_4 //* for executing
 */

public class Part_67_4 {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.getMessage();

        Child2 child2 = new Child2();
        child2.getMessage();
    }
}
