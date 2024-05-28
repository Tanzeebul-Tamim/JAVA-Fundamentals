package class_tasks.chapter_4_conditionals.lessons;

public class Part_17_relational_and_logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("For logical AND: ");
        if (a && b && c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For logical AND: ");
        if (a || b || c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For logical NOT: ");
        System.out.println("Not(a) is: " + !a);
        System.out.println("Not(b) is: " + !b);
        System.out.println("Not(c) is: " + !c);
    }
}
