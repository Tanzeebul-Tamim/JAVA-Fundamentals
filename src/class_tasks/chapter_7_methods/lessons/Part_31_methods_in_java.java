package class_tasks.chapter_7_methods.lessons;

public class Part_31_methods_in_java {
    static int logic(int x, int y) {
        int z;

        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }

        return z;
    }

    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 7;
        int c1;

        c1 = logic(a1, b1);

        System.out.println(c1);

        int a2 = 2;
        int b2 = 1;
        int c2;

        c2 = logic(a2, b2);

        System.out.println(c2);
    }
}
