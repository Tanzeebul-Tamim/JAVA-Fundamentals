package class_tasks.chapter_2_operators_and_expressions.lessons;

public class Part_10_data_type_of_expressions_and_increment_decrement_operators {
    public static void main(String[] args) {
        byte b = 50;
        short s = 100;
        int i = 200;
        long l = 300L;
        float f = 4.0F;
        double d = 5.0;
        char c = 'G'; // Note that, single quotation is used for char and double quotation is used for
                      // String

        System.out.println(b + s); // byte + short = integer
        System.out.println(s + i); // short + integer = integer
        System.out.println(l + f); // long + float = float
        System.out.println(i + f); // integer + float = float
        System.out.println(c + i); // char + integer = integer
        System.out.println(c + s); // char + short = integer
        System.out.println(l + d); // long + double = double
        System.out.println(f + d); // float + double = double

        // * Increment and decrement operators
        int j = 56;
        int k = ++j; // first j is incremented (57), then j is assigned to k
        int m = j++; // first j is assigned to m, then j is incremented (57)

        System.out.println(k);
        System.out.println(m);

        System.out.println(j++); // j is printed first, then incremented by 1
        System.out.println(j); // now you'll see that the value has been incremented
        System.out.println(++j); // j is incremented by 1 first, then printed
        System.out.println(j); // you'll get the same output as the previous one, because it already had been
                               // incremented

        // * quick quiz
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        char a = 'B';
        a++;
        System.out.println(a);
    }
}
