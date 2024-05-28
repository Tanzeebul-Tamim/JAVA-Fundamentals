package class_tasks.chapter_2_operators_and_expressions.practice_tasks;

// Write the following expression in a Java program
/*
    (v^2 - u^2)
    -----------
        2as
*/

public class Part_12_4 {
    public static void main(String[] args) {
        float V = 56.342f;
        float U = 10.34f;
        float a = 23f;
        float s = 10f;

        float result = (V * V - U * U) / 2 * a * s;
        System.out.println(result);
    }
}
