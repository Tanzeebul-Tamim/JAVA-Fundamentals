package class_tasks.chapter_12_access_modifiers.lessons.package1;

class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    // * All the access modifiers can be used within the same Class
    public void meth1() {
        System.out.println("Printing within same Class");
        
        System.out.println(x); // Allowed (public)
        System.out.println(y); // Allowed (protected)
        System.out.println(z); // Allowed (package-private(default))
        System.out.println(a); // Allowed (private)
    }
}

public class Part_66_access_modifiers_1 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();

        // * All the access modifiers can be used within the same package, except for "private"
        System.out.println("\nPrinting within same package");

        System.out.println(c.x); // Allowed (public)
        System.out.println(c.y); // Allowed (protected)
        System.out.println(c.z); // Allowed (package-private(default))
        // System.out.println(c.a); // Not Allowed (private)
    }
}
