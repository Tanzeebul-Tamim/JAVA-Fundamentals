package class_tasks.chapter_11_abstract_classes_and_interfaces.lessons;

//* While implementing a method in a class from an interface, the method must be "public"

//* Java does not support multiple inheritance directly but a similar kind of effect can be achieved using Interfaces. A class can implement multiple Interfaces and extend a class at the same time.

//* This example can be used like this to determine when to use interface and when to use inheritance. Mountain bike is a type of bicycle thus the class "MountainBike" inherits from the abstract class "Bicycle". And it has features such as shifting gears and height adjustable seat post, so we can access this features from the interfaces "Shifter" and "DropperPost"

abstract class Bicycle {
    // * Non-abstract methods in an abstract class can provide default functionality
    // that subclasses can inherit.
    void mountBike() {
        System.out.println("Get on the bike");
    }

    void unmountBike() {
        System.out.println("Get off the bike");
    }

    public abstract void applyBrake(int decrement);

    public abstract void speedUp(int increment);
}

// * Non-access modifiers (such as static, abstract etc) of the properties of
// interfaces are by default set to "final"
// * The class implementing an Interface must define/override the methods (not
// mandatory to override the fields).
// * You can create references of Interfaces but not the object.
// * Interface methods are public by default.
interface Shifter {
    int numberOfGears = 12;

    void upShift(int upshift);

    void downShift(int downshift);
}

interface DropperPost {
    boolean isWireless = true;

    void raiseSeatPost();

    void lowerSeatPost();
}

// * We can't extend multiple abstract classes but we can implement multiple
// interfaces at a time
class MountainBike extends Bicycle implements Shifter, DropperPost {
    // * Overridden class from abstract classes/interfaces must be public

    // * Overridden from class Bicycle
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Speed decremented " + decrement);
    }

    // * Overridden from class Bicycle
    @Override
    public void speedUp(int increment) {
        System.out.println("Speed incremented " + increment);
    }

    // * Overridden from interface DropperPost
    @Override
    public void raiseSeatPost() {
        System.out.println("Seat post raised");
    }

    // * Overridden from interface DropperPost
    @Override
    public void lowerSeatPost() {
        System.out.println("Seat post lowered");
    }

    // * Overridden from interface Shifter
    @Override
    public void upShift(int upshift) {
        System.out.println("Upshifted " + upshift + " gears");
    }

    // * Overridden from interface Shifter
    @Override
    public void downShift(int downshift) {
        System.out.println("Downshifted " + downshift + " gears");
    }

    // * Own method of Mountain Bike class (not overridden)
    void pumpSuspension() {
        System.out.println("Pumping shocks");
    }
}

public class Part_55_abstract_classes_vs_interfaces {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        MountainBike harryBike = new MountainBike();

        harryBike.mountBike();
        harryBike.unmountBike();

        harryBike.applyBrake(4);
        harryBike.speedUp(7);

        harryBike.upShift(1);
        harryBike.downShift(3);

        harryBike.raiseSeatPost();
        harryBike.lowerSeatPost();

        harryBike.pumpSuspension();

        // * You can create properties in interfaces
        System.out.println("My bike has " + harryBike.numberOfGears + " gears"); // Allowed

        if (harryBike.isWireless) {
            System.out.println("My dropper post uses Bluetooth for wireless connectivity");
        } else {
            System.out.println("My dropper post operates hydraulically");
        }

        // * But you cannot modify the properties of Interfaces as they've already been
        // finalized
        // harryBike.numberOfGears = 10; // Not Allowed
    }
}
