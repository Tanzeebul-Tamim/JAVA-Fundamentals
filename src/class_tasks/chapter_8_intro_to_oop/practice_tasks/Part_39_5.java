package class_tasks.chapter_8_intro_to_oop.practice_tasks;

import java.util.Scanner;

// Create a Class Tommy with properties: name (String), health (int), position (String); methods: hit(), run(), fire(), getHealth(), setHealth(int health), getPosition(), setPosition(String position), displayStatus(); ensure health is within a valid range (0 to 100).

class Tommy {
    String name = "Tommy";
    int health = 100;
    String position = "Miami";

    public void hit() {
        System.out.println("Hitting the enemy!");
    }

    public void run() {
        System.out.println("Running from the cops!");
    }

    public void fire() {
        System.out.println("Firing the swats!");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 || health > 100) {
            throw new IllegalArgumentException("Valid range for health is 0 to 100!");
        }

        this.health = health;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayStatus() {
        System.out.format("Player name: %s\n", name);
        System.out.format("Health status: %d\n", health);
        System.out.format("Current Position: %s\n", position);
    }
}

public class Part_39_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tommy player1 = new Tommy();

        player1.hit();
        player1.run();
        player1.fire();

        // ! Health Status
        // * Get the current health status
        System.out.println("\nThe current health status of the player is " + player1.getHealth());

        // * Update the health status
        System.out.println("Enter the updated health value:");
        int health = scanner.nextInt();
        player1.setHealth(health);

        // * Get the updated health status
        System.out.println("The updated health status of the player is " + player1.getHealth());

        // ! Position
        // * Get the current position
        System.out.println("The current position of the player is at " + player1.getPosition());

        //* Clear the newline left by nextInt
        scanner.nextLine();

        // * Update the position
        System.out.println("Enter the updated position:");
        String position = scanner.nextLine();
        player1.setPosition(position);

        // * Get the updated position
        System.out.println("The updated position of the player is at " + player1.getPosition());

        scanner.close();
        player1.displayStatus();
    }
}
