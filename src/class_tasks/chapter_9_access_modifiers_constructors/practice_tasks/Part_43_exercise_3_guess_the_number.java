package class_tasks.chapter_9_access_modifiers_constructors.practice_tasks;

import java.util.Scanner;
import java.util.Random;

/*
    Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is correct or not
    4. Use properties such as noOfGuesses(int), etc to get this tasks done!
    5. getter and setter for noOfGuesses.
 */

class Game {
    private int userInput;
    private int computerInput;
    private int score = 100;
    private int noOfGuesses = 10;
    private int roundFigure;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Game() {
        System.out.printf("\nYour current score is %d\n", score);
        computerInput = random.nextInt(1, 101);
    }

    public void takeUserInput() {
        System.out.println("\nEnter a number between 1 to 100:");
        int userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 100) {
            throw new Error(String.format("Invalid input %d. Must be between 1 to 100", userInput));
        }

        this.userInput = userInput;
        noOfGuesses--;
        isCorrectNumber();
    }

    public void isCorrectNumber() {
        if (computerInput == userInput) {
            System.out.printf("You won! Your score is %d. You spent %d guesses.", score, (10 - noOfGuesses));
        } else {
            score -= 10;
            int roundFigure = userInput / 10 * 10;

            if (score == 0) {
                System.out.printf(
                        "Incorrect Guess! You lose! Your score is %d. The number was %d",
                        score,
                        computerInput);
            } else {
                if (score >= 60) {
                    if (computerInput > userInput) {
                        System.out.printf(
                                "\nIncorrect Guess!\nThe number is greater than that.\n%d guesses left!\nCurrent Score: %d\n",
                                noOfGuesses,
                                score);
                    } else {
                        System.out.printf(
                                "\nIncorrect Guess!\nThe number is less than that.\n%d guesses left!\nCurrent Score: %d\n",
                                noOfGuesses,
                                score);
                    }
                } else {
                    if (roundFigure == this.roundFigure) {
                        if (computerInput > userInput) {
                            System.out.printf(
                                    "\nIncorrect Guess!\nThe number is a little bit greater than that.\n%d guesses left!\nCurrent Score: %d\n",
                                    noOfGuesses,
                                    score);
                        } else {
                            System.out.printf(
                                    "\nIncorrect Guess!\nThe number is a little bit less than that.\n%d guesses left!\nCurrent Score: %d\n",
                                    noOfGuesses,
                                    score);
                        }
                    } else {
                        if (computerInput > roundFigure) {
                            System.out.printf(
                                    "\nIncorrect Guess!\nThe number is greater than %d\n%d guesses left!\nCurrent Score: %d\n",
                                    roundFigure,
                                    noOfGuesses,
                                    score);
                        } else {
                            System.out.printf(
                                    "\nIncorrect Guess!\nThe number is less than %d\n%d guesses left!\nCurrent Score: %d\n",
                                    roundFigure,
                                    noOfGuesses,
                                    score);
                        }
                    }
                }

                this.roundFigure = roundFigure;
                takeUserInput();
            }
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}

public class Part_43_exercise_3_guess_the_number {
    public static void main(String[] args) {
        System.out.println("Welcome to the game \"Guess the Number\"!");
        Game guessTheNumber = new Game();

        guessTheNumber.takeUserInput();
        guessTheNumber.closeScanner();
    }
}