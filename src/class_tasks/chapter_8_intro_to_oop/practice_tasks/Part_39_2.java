package class_tasks.chapter_8_intro_to_oop.practice_tasks;

import java.util.Scanner;

// Create a Class cellphone with methods to print "ringing...", "vibrating..." etc

class Cellphone {
    String brandName;

    public void ring() {
        System.out.printf("My %s phone is Ringing...\n", brandName);
    }

    public void vibrate() {
        System.out.printf("My %s phone is Vibrating...\n", brandName);
    }

    public void playMusic() {
        System.out.printf("My %s phone is Playing music...\n", brandName);
    }
}

public class Part_39_2 {
    public static void main(String[] args) {
        Cellphone samsung = new Cellphone();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your cellphone brand name:");
        String brandName = sc.next();

        sc.close();

        samsung.brandName = brandName;

        samsung.ring();
        samsung.vibrate();
        samsung.playMusic();
    }
}
