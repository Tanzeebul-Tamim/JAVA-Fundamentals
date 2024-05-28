package class_tasks.chapter_3_strings.practice_tasks;

// Write a program to detect double and triple spaces in a string

public class Part_15_4 {
    public static void main(String[] args) {
        String givenString = " Hello World!  I'm learning strings";
        int checkDoubleSpace = givenString.indexOf("  ");
        System.out.println(checkDoubleSpace);

        int checkTripleSpace = givenString.indexOf("   ");
        System.out.println(checkTripleSpace);
    }
}
