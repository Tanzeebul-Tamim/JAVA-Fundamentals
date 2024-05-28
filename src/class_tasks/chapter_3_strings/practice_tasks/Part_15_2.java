package class_tasks.chapter_3_strings.practice_tasks;

// Write a program to replace spaces with underscores

public class Part_15_2 {
    public static void main(String[] args) {
        String givenString = "Hello World!";
        givenString = givenString.replace(' ', '_');
        System.out.println(givenString);
    }
}
