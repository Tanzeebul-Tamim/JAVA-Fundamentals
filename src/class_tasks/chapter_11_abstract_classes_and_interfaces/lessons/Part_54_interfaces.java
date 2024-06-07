package class_tasks.chapter_11_abstract_classes_and_interfaces.lessons;

//* In Java, an interface is a group of related methods with empty bodies
//* References of interfaces can be made but objects can't be made from interfaces

//* Implementing an Interface forces method implementation

//* "extends" for inherited class
//* "implements" for "interface"

interface Bike {
    void applyBrake(int decrement);
    void accelerate(int increment);
}

class Mtb implements Bike {
    int speed;

    Mtb(int speed) {
        this.speed = speed;
    }
    
    int getSpeed() {
        return speed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void accelerate(int increment) {
        speed += increment;
    }
}

public class Part_54_interfaces {
    public static void main(String[] args) {
        Mtb octaneOne = new Mtb(7);

        System.out.printf("Current speed is %d kmh\n", octaneOne.getSpeed());

        octaneOne.accelerate(5);
        System.out.printf("Speed after accelerating is %d kmh\n", octaneOne.getSpeed());

        octaneOne.applyBrake(4);
        System.out.printf("Speed after applying brake is %d kmh\n", octaneOne.getSpeed());
    }
}
