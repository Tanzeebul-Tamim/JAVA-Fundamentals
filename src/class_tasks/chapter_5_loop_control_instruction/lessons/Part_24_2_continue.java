package class_tasks.chapter_5_loop_control_instruction.lessons;

public class Part_24_2_continue {
    public static void main(String[] args) {
        // Continue using loops! Continue skips the rest of the code in the iteration
        // and continues to the next iteration
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.printf("Skipping step %d\n", i);
                continue;
            }

            System.out.println(i + " Java is great!");
        }
        System.out.println("Loop ends here!");

        System.out.println('\n');

        int i = 0;
        while (i < 10) {
            if (i == 8) {
                System.out.printf("Skipping step %d\n", i);
                i++;
                continue;
            }

            System.out.println(i + " Java is great!");
            i++;
        }
        System.out.println("Loop ends here!");

        System.out.println('\n');

        int j = 0;
        do {
            if (j == 3) {
                System.out.printf("Skipping step %d\n", j);
                j++;
                continue;
            }

            System.out.println(j + " Java is great!");
            j++;
        } while (j < 10);
        System.out.println("Loop ends here!");
    }
}
