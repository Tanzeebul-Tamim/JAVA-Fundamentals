package class_tasks.chapter_11_abstract_classes_and_interfaces.lessons;

//* Static methods are not associated with objects, they're associated with classes or interfaces
interface Camera {
    void takeSnap();

    void recordVideo();

    //* Implementing default interface methods in a class is optional. If implemented, the class method overrides the default interface method and gets executed from the class method.
    default void record4kVideo() {
        System.out.println("Recording in 4k");
    }
}

// * Interfaces can also include private methods for default methods to use which can only be accessed within the interface itself
interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);

    private int encryptPassword(int password) {
        int encryptedPassword = password * 15;
        return encryptedPassword;
    }

    default void setPassword(int password) {
        System.out.printf("Password (%d) has been set\n", encryptPassword(password));
    }
}

class CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting....");
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi {
    //* from interface Camera
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    /*
     * You can override the default method in the class as well.
     * If you do so, the one defined in the interface won't be executed.
     */
    // public void record4kVideo() {
    //     System.out.println("Taking snap and Recording in 4k");
    // }

    //* from interface Wifi
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = { "John", "Harry", "Peter" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    //* Own method of SmartPhone
    public void powerOn() {
        System.out.println("Smartphone turning on");
    }

    public void powerOff() {
        System.out.println("Smartphone turning off");
    }
}

public class Part_57_interfaces_examples_and_default_methods {
    public static void main(String[] args) {
        SmartPhone note20 = new SmartPhone();
        String[] availableNetworks = note20.getNetworks();

        for (String network : availableNetworks) {
            System.out.println(network);
        }

        note20.takeSnap();
        note20.recordVideo();
        note20.record4kVideo();

        // note20.encryptPassword(1234); // not Allowed due to being a "private" method
        note20.setPassword(1234);

        note20.pickCall();
        note20.callNumber(12345);

        note20.powerOn();
        note20.powerOff();
    }
}
