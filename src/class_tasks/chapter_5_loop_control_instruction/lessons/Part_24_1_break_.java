package class_tasks.chapter_5_loop_control_instruction.lessons;

public class Part_24_1_break_ {
    public static void main(String[] args) {
        // Break using loops! Break terminates a loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Java is great!");

            if (i == 5) {
                System.out.println("Ending the loop!");
                break;
            }
        }
        System.out.println("Loop ends here!");

        System.out.println('\n');

        int i = 0;
        while (i < 10) {
            System.out.println(i + " Java is great!");

            if (i == 5) {
                System.out.println("Ending the loop!");
                break;
            }
            i++;
        }
        System.out.println("Loop ends here!");

        System.out.println('\n');

        int j = 0;
        do {
            System.out.println(j + " Java is great!");

            if (j == 5) {
                System.out.println("Ending the loop!");
                break;
            }
            j++;
        } while (j < 10);
        System.out.println("Loop ends here!");
    }
}
