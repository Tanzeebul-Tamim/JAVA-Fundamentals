package class_tasks.chapter_10_inheritance.lessons;

// Create a class Animal and derive another class Dog from it

class Animal {
    private String name;
    private int age;
    private String species;
    private double weight;

    public Animal(String name, int age, String species, double weight) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.weight = weight;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;

    }

    public String getSpecies() {
        return species;

    }

    public double getWeight() {
        return weight;
    }

    public void eat(String food) {
        System.out.printf("%s is eating %s.\n", name, food);
    }

    public void sleep() {
        System.out.printf("%s is sleeping.\n", name);
    }

    public void makeSound() {
        System.out.printf("%s is making sound.\n", name);
    }

    public void move(String direction) {
        System.out.printf("%s is moving towards %s\n", name, direction);
    }

    public void showInfo() {
        System.out.printf(
                "My name is %s.\n I am %d years old.\n I am %s species.\n I weigh %s kg.\n",
                name,
                age,
                species,
                weight);
    }
}

class Dog extends Animal {
    private String breed;
    private boolean isTrained;

    public Dog(String name, int age, String species, double weight, String breed, boolean isTrained) {
        super(name, age, species, weight);

        this.breed = breed;
        this.isTrained = isTrained;
    }

    public void showDogInfo() {
        System.out.printf(
                "%s is a %s breed %s. He's %d years old and weighs %.2f kg.\n",
                getName(),
                breed,
                getSpecies(),
                getAge(),
                getWeight());
    }

    public void bark() {
        System.out.printf("%s is barking.\n", getName());
    }

    public void isTrained() {
        if (isTrained) {
            System.out.printf("%s is a trained %s\n", getName(), getSpecies());
        } else {
            System.out.printf("%s is not a trained %s\n", getName(), getSpecies());
        }
    }
}

public class Part_45_quiz {
    public static void main(String[] args) {
        Dog dollar = new Dog("Dollar", 8, "Dog", 12, "German Shepherd", true);

        dollar.eat("Meat");
        dollar.sleep();
        dollar.makeSound();
        dollar.move("North");
        dollar.showInfo();
        dollar.showDogInfo();
        dollar.bark();
        dollar.isTrained();
    }
}
