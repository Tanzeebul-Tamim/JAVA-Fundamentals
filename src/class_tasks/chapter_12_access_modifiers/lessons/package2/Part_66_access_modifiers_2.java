package class_tasks.chapter_12_access_modifiers.lessons.package2;

import class_tasks.chapter_12_access_modifiers.lessons.package1.C2;

class C3 extends C2 {
    void meth3() {
        // * Only "Public" and "Protected" access modifiers can be used within the same sub-class in a different package
        System.out.println("Printing within same sub-class (different package)");

        System.out.println(x); // Allowed (public)
        System.out.println(y); // Allowed (protected)
        // System.out.println(z); // Not Allowed (package-private(default))
        // System.out.println(a); // Not Allowed (private)
    }

    int[] getC2Values() {
        // * z and a are not accessible because they have package-private (default) and
        // private access, respectively
        // int[] values = {x, y, z, a};
        int[] values = { x, y };
        return values;
    }
}

public class Part_66_access_modifiers_2 {
    public static void main(String[] args) {
        C3 c = new C3();

        for (int value : c.getC2Values()) {
            System.out.println(value);
        }

        // * Only the public access modifier can be used in any other class (outside the package and not a class, neither a subclass)
        // or sub-class
        System.out.println("Printing from world class)");
        
        System.out.println(c.x); // Allowed (public)
        // System.out.println(c.y); // Not Allowed (protected)
        // System.out.println(c.z); // Not Allowed (package-private(default))
        // System.out.println(c.a); // Not Allowed (private)
    }
}
