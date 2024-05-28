package class_tasks.chapter_4_conditionals.practice_tasks;

import java.util.Random;
import java.util.Scanner;

public class Part_20_rock_paper_scissors_challenge {
    public static byte[] calculateScore(String userMove, String computerMove, byte[] scores) {
        if (userMove.equals(computerMove)) {
            System.out.println("It's a Tie!");
        } else {
            switch (userMove) {
                case "Rock" -> {
                    switch (computerMove) {
                        case "Paper" -> {
                            System.out.println("Computer got one point!");
                            scores[1]++;
                        }
                        case "Scissors" -> {
                            System.out.println("You got one point!");
                            scores[0]++;
                        }
                    }
                }
                case "Paper" -> {
                    switch (computerMove) {
                        case "Rock" -> {
                            System.out.println("You got one point!");
                            scores[0]++;
                        }
                        case "Scissors" -> {
                            System.out.println("Computer got one point!");
                            scores[1]++;
                        }
                    }
                }
                case "Scissors" -> {
                    switch (computerMove) {
                        case "Rock" -> {
                            System.out.println("Computer got one point!");
                            scores[1]++;
                        }
                        case "Paper" -> {
                            System.out.println("You got one point!");
                            scores[0]++;
                        }
                    }
                }
            }
        }

        System.out.println("Your score: " + scores[0]);
        System.out.println("Computer's score: " + scores[1]);

        return scores;
    }

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            byte computerScore = 0;
            byte userScore = 0;
            byte[] scores = { userScore, computerScore };

            System.out.println("Welcome to rock, paper, scissors game!");
            System.out.println("Input 'r' for rock, 'p' for paper and 's' for scissors\n");

            System.out.println("How many rounds do you want to play?\n");
            byte numberOfRounds = scanner.nextByte();
            scanner.nextLine();

            for (byte i = 0; i < numberOfRounds; i++) {
                if (i == numberOfRounds - 1) {
                    System.out.println("\nFinal round begins!\n");
                } else {
                    System.out.printf("\nRound %d begins!\n", i + 1);
                }

                int computerInput = random.nextInt(3);

                System.out.println("Please enter your move:\n");
                String userInputStr = scanner.nextLine();

                int userInput;

                if (userInputStr.equals("r")) {
                    userInput = 0;
                } else if (userInputStr.equals("p")) {
                    userInput = 1;
                } else if (userInputStr.equals("s")) {
                    userInput = 2;
                } else {
                    throw new Exception("Invalid input!");
                }

                String[] moves = { "Rock", "Paper", "Scissors" };

                String computerMove = moves[computerInput];
                String userMove = moves[userInput];

                System.out.println("\nYour move: " + userMove);
                System.out.println("Computer's move: " + computerMove + "\n");

                byte[] updateScore = calculateScore(userMove, computerMove, scores);

                userScore = updateScore[0];
                computerScore = updateScore[1];

            }

            if (userScore > computerScore) {
                System.out.println("\nYou won!");
            } else if (userScore < computerScore) {
                System.out.println("\nComputer won!");
            } else {
                System.out.println("\nThe game ended in a draw!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
