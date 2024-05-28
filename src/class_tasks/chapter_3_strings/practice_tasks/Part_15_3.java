package class_tasks.chapter_3_strings.practice_tasks;

// Write a program to fill in a letter template which looks like below:
// letter = "Dear <|name|>, Thanks a lot!"

public class Part_15_3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        String name = "Tanzee";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
