package class_tasks.chapter_8_intro_to_oop.practice_tasks;

import java.util.Scanner;

/*
     Create a Class Employee with following properties and methods:
     salary(property)(int)
     getSalary(method returning int)
     name(property)(string)
     getName(method returning String)
     setName(method changing name)
 */

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Part_39_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        System.out.println("Please enter your salary: ");
        int salary = sc.nextInt();

        sc.close();

        employee.setName(name);
        
        employee.salary = salary;

        String retrieveName = employee.getName();
        System.out.println("My name is " + retrieveName);

        int retrieveSalary = employee.getSalary();
        System.out.println("My salary is " + retrieveSalary);
    }
}
