package class_tasks.chapter_8_intro_to_oop.lessons;

class Employee {
    String name;
    int id;
    int salary;

    public void printDetails() {
        System.out.println("My name is " + name);
        System.out.println("My id is " + id);
    }

    public int getSalary() {
        return salary;
    }
}

public class Part_38_creating_our_own_class {
    public static void main(String[] args) {
        // * Instantiating a new Employee object/making an instance of Employee class
        // for Tamim
        Employee tamim = new Employee();

        // * Instantiating a new Employee object/making an instance of Employee class
        // for John
        Employee john = new Employee();

        // * Setting properties/attributes for tamim
        tamim.name = "Tanzeebul Tamim";
        tamim.id = 23301265;
        tamim.salary = 34000;

        // * Setting properties/attributes for john
        john.name = "John Doe";
        john.id = 23201355;
        john.salary = 12000;

        // * Printing the properties/attributes
        // System.out.println(tamim.id);
        // System.out.println(tamim.name);
        tamim.printDetails();
        john.printDetails();
        int tamimSalary = tamim.getSalary();
        int johnSalary = john.getSalary();

        System.out.println(tamimSalary);
        System.out.println(johnSalary);
    }
}
