package class_tasks.chapter_11_abstract_classes_and_interfaces.lessons;

interface MyCamera {
    void takeSnap();

    void recordVideo();

    default void record4kVideo() {
        System.out.println("Recording in 4k");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectToNetwork(String network);

    private int encryptPassword(int password) {
        int encryptedPassword = password * 15;
        return encryptedPassword;
    }

    default void setPassword(int password) {
        System.out.printf("Password (%d) has been set", encryptPassword(password));
    }
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    //* from interface MyCamera
    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    //* default method from interface MyCamera
    @Override
    public void record4kVideo() {
        System.out.println("Taking snap and Recording in 4k");
    }

    //* from interface MyWifi
    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = { "John", "Harry", "Peter" };
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    //* Own method of MySmartPhone
    public void powerOn() {
        System.out.println("Smartphone turning on");
    }

    public void powerOff() {
        System.out.println("Smartphone turning off");
    }
}

public class Part_59_polymorphism_in_interface {
    public static void main(String[] args) {
        /*
            The concept of polymorphism:
            We're referencing the smartphone as a camera, which means, for now we're using the smartphone as a camera. So we cannot access other methods which don't belong to the interface MyCamera

            We can remember it like this,
            "This is a smartphone, but use it only as a camera"
        */ 
        MyCamera camera = new MySmartPhone(); 

        //* Only Allowed - methods from MyCamera
        camera.takeSnap();
        camera.recordVideo();
        camera.record4kVideo();

        //* Not Allowed - methods from MyWifi
        // camera.getNetworks();
        // camera.connectToNetwork();
        // camera.setPassword();

        //* Not Allowed - methods from MyCellPhone
        // camera.callNumber();
        // camera.pickCall();

        //* Not Allowed - methods from MySmartPhone
        // camera.powerOn();
        // camera.poweroff();
    }
}
