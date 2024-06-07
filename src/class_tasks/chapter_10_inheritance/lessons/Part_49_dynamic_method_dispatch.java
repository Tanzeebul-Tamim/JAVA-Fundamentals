package class_tasks.chapter_10_inheritance.lessons;

/*
    Dynamic method dispatch in Java lets the program decide at runtime which method to call based on the actual object type, allowing child class methods to be used even if the reference is to a parent class.
 */

class Phone {
    public void call() {
        System.out.println("Call ringing....");
    }

    public void name(String name) {
        System.out.printf("This is a %s phone\n", name);
    }
}

class Smartphone extends Phone {
    public void turOnGps() {
        System.out.println("Turning GPS on....");
    }

    public void name(String name) {
        System.out.printf("This is a %s smartphone\n", name);
    }
}

public class Part_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        /*
            "new" means, the object is created at runtime
            Dynamic method dispatch allows the JVM to decide at runtime which version of a method to call. This is based on the actual object's type, not the reference type.
         */

        // Allowed
        Phone nokia = new Phone();
        nokia.call();
        nokia.name("Nokia");

        // Allowed
        Smartphone iphone = new Smartphone();
        iphone.turOnGps();
        iphone.name("iPhone");

        // Also allowed
        Phone samsung = new Smartphone();
        samsung.call();
        samsung.name("Samsung"); // Will run from the child/sub class if method has been overridden

        /*
          Not allowed, only those methods are allowed that are either defined in the
          parent class or have been overridden in a child/sub class.
          Because it looks for the method in the parent class.
         */
        // samsung.turOnGps();

        // Not allowed
        // Smartphone iphone = new Phone();
    }
}
