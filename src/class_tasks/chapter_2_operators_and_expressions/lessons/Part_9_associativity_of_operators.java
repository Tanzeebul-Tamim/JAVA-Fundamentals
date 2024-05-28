package class_tasks.chapter_2_operators_and_expressions.lessons;

public class Part_9_associativity_of_operators {
    public static void main(String[] args) {
        // * Highest precedence goes to * and /. They're then evaluated on the basis of
        // left to right associativity
        int example1 = 6 * 5 - 34 / 2;
        /*
         * = 30 - 17
         * = 13
         */

        int example2 = 5 * 6 / 5 - 3 * 2;
        /*
         * = 30 / 5 - 6
         * = 6 - 6
         * = 0
         */
        System.out.println(example1);
        System.out.println(example2);

        // * Quick quiz
        // problem 1
        int x = 6;
        int y = 1;
        int k = (x - y) / 2;
        System.out.println(k);

        // problem 2
        int a = 5;
        int b = 1;
        int c = 4;
        int l = (b * b - 4 * a * c) / (2 * a);
        System.out.println(l);

        // problem 3
        int v = 5;
        int u = 6;
        int m = v * v - u * u;
        System.out.println(m);

        // problem 4
        int d = 2;
        int n = a * b - d;
        System.out.println(n);
    }
}
