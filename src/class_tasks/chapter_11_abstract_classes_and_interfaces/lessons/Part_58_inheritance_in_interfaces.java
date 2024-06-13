package class_tasks.chapter_11_abstract_classes_and_interfaces.lessons;

interface Parent {
    void meth1();
    void meth2();
}

interface Child extends Parent {
    void meth3();
    void meth4();
}

class SampleClass implements Child { 
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
    
    //* interface "Child" will enforce "meth1" and "meth2" inherited from interface "Parent"
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
}

public class Part_58_inheritance_in_interfaces {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
