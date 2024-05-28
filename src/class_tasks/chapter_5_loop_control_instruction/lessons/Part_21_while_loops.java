package class_tasks.chapter_5_loop_control_instruction.lessons;

public class Part_21_while_loops {
    public static void main(String[] args) {
        int i = 100;
        // while-loop checks the condition first & then executes the code
        while (i <= 200) {
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop ");
        // you can use while loop for a certain condition, for example if you don't know
        // how many times the loop is going to iterate, you can specify a condition in
        // while loop that you cannot do with for loop
        // while (true) {
        // System.out.println("I'm an infinite while loop");
        // }
    }
}
