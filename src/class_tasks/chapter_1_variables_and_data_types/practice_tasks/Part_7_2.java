package class_tasks.chapter_1_variables_and_data_types.practice_tasks;

// Write a program to calculate CGPA using marks of three subjects (out of 100)

public class Part_7_2 {
    public static void main(String[] args) {
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 + subject3) / 30;
        System.out.println(cgpa);
    }
}
