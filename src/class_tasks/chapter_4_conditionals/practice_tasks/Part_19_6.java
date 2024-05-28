package class_tasks.chapter_4_conditionals.practice_tasks;

import java.util.Scanner;

// Write a program to find out the type of website from the url.
//.com -> Commercial website, .org -> organization website, .in -> Indian website

public class Part_19_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your url: ");
        String url = sc.next();
        sc.close();

        int urlDotIndex = url.lastIndexOf(".");
        int slashIndex = url.indexOf("/", urlDotIndex);

        String topLevelDomain = url.substring(urlDotIndex, slashIndex);

        if (topLevelDomain.equals(".com")) {
            System.out.println("Your website is a commercial website.");
        } else if (topLevelDomain.equals(".org")) {
            System.out.println("Your website is an organization website.");
        } else if (topLevelDomain.equals(".in")) {
            System.out.println("Your website is a Indian website.");
        }
    }
}
