package class_tasks.chapter_9_access_modifiers_constructors.lessons;

class MyEmployee {
    private int id;
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setId(int id) {
        this.id = id;
    }

    // Getter method
    public int getId() {
        return id;
    }
}

public class Part_40_access_modifiers_getters_setters {
    public static void main(String[] args) {
        MyEmployee tanzee = new MyEmployee();
        
        //* Not accessible this way. Will throw an error due to "private" access modifier
        // tanzee.id = 45;
        // tanzee.name = "Tanzeebul Tamim";

        //* Instead now we can use setter method to set the id and name
        tanzee.setId(23301265);
        tanzee.setName("Tanzeebul Tamim");

        System.out.println(tanzee.getId());
        System.out.println(tanzee.getName());
    }
}
