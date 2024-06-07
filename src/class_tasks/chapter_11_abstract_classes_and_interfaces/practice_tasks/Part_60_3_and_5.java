package class_tasks.chapter_11_abstract_classes_and_interfaces.practice_tasks;

// 3. Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.
// 5. Demonstrate polymorphism using Monkey class

interface BasicAnimal {
    void eat(String food);
    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

class Human extends Monkey implements BasicAnimal {
    public void eat(String food) {
        System.out.println("Eating " + food + "...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    void speak() {
        System.out.println("Hello sir!");
    }
}

public class Part_60_3_and_5 {
    public static void main(String[] args) {
        Human homoSapiens = new Human();

        homoSapiens.jump();
        homoSapiens.bite();
        homoSapiens.eat("Apple");
        homoSapiens.sleep();

        Monkey monkey = new Human();

        //* Cannot use "speak" method because the reference is "monkey" which doesn't have "speak" method
        // monkey.speak();

        //* Allowed
        monkey.bite();
        monkey.jump();

        BasicAnimal darwin = new Human();
        
        //* not Allowed
        // darwin.speak();
        darwin.eat("Bread");
        darwin.sleep();
    }
}
