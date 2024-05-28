package class_tasks.chapter_2_operators_and_expressions.lessons;

public class Part_8_operators_and_expressions {
    public static void main(String[] args) {
        // * Arithmetic operators
        int a = 4;
        int b = 6 % a; // * Modulo operator
        System.out.println(b);
        System.out.println(4.8 % 1.1); // * Modulo also works for float and double where you'll get decimal remainder

        // * Assignment operator
        int c = 9;
        c *= 3;
        System.out.println(c);

        // * Comparison operator
        System.out.println(65 < 6);
        System.out.println(65 > 6);
        System.out.println(65 <= 6);
        System.out.println(65 >= 6);
        System.out.println(65 == 6);
        System.out.println(65 != 6);

        // * Logical operator
        System.out.println(64 > 5 && 64 > 98); // * Logical and
        System.out.println(64 < 5 || 64 > 98); // * Logical or

        // * Bitwise operator
        System.out.println(9 & 3); // * Bitwise and
        System.out.println(9 | 3); // * Bitwise and
        System.out.println(9 ^ 3); // * Bitwise xor

        // * Explanation of bitwise operator
        // 1001
        // 0011
        // we have two numbers 9 and 3 and we'll perform bitwise and (&) operation. If
        // we convert 9 and 3 into binary, we get 1001 and 11 respectively. We added two
        // leading zeroes before 11 to make the two binary numbers of equal digits. Now
        // if we do "and" operation between the left most digits of both of the numbers
        // which is 1 & 0, we get 0 as a result. Doing the same for the other three
        // digits, we get 0, 0 and 1. So the number we get for the bitwise and operation
        // is 0001 which is equivalent to 1. So we get 1 as a result.

        // For bitwise operator we do the same procedure but we do or(|) operation for
        // all the digits and thus we get 1011. Converting that into decimal, we get 11
        // as a result.

        // XOR acts like an "odd one out" finder. It checks two bits (0 or 1) and
        // returns true (1) only if exactly one of them is different (one is 0 and the
        // other is 1). If both bits are the same ((0 and 0) or (1 and 1)) it returns
        // false (0). For the left most two digits of the two numbers 1 and 0, which are
        // different values, we get 1. for the other 3 digits, we get 0,1 and 0. So we
        // get 1010. Converting that into decimal, we get 10.
    }
}
