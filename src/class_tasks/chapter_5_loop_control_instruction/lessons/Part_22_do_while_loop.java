package class_tasks.chapter_5_loop_control_instruction.lessons;

public class Part_22_do_while_loop {
    public static void main(String[] args) {
        int b = 10;
        // do-while loop executes the code of "do" block first, then checks the
        // condition.
        do {
            System.out.println(b);
            b++;
        } while (b < 5);
    }
}
