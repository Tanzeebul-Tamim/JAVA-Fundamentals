package class_tasks.chapter_9_access_modifiers_constructors.lessons;

class Student {
    private int id;
    private String name;
    private String dept;
    private int fee;

    // Constructor Method: A constructor method must be declared with the same name as the class.
    public Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    // Constructor overloading: Constructors can be overloaded just like other methods in Java.
    public Student() {
        fee = 80000;
    }

    // Getter method
    public int getId() {
        return id;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Getter method
    public String getDept() {
        return dept;
    }

    // Getter method
    public int getFee() {
        return fee;
    }
}

public class Part_42_1_constructors {
    public static void main(String[] args) {
        Student tanzee = new Student(23301265, "Tanzeebul Tamim", "CSE");
        Student tamim = new Student();

        System.out.printf(
                "My name is %s, my id is %d and my department is %s\n",
                tanzee.getName(),
                tanzee.getId(),
                tanzee.getDept()
            );

        // Calling the second MyMainEmployee which doesn't take any parameters
        System.out.printf("My semester fee is %d\n", tamim.getFee());
    }
}
