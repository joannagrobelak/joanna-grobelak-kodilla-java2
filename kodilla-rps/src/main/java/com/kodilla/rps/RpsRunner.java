package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    private Random randomMove = new Random();
    private Scanner in = new Scanner(System.in);
    private String playerName;
    private Integer roundsNumber;
    private PlayerChoise playerMove;
    private int computerMove;
    private int playerScore;
    private int computerScore;


    private void askForName() {
        System.out.println("Hello, what's your name? ");
        playerName = in.nextLine();
    }

    private void askForRoundsNumber() {

        System.out.println("Welcome to the game " + playerName +
                "! \n How many rounds would you like to play? Type a number from 1 to 10: ");

        String roundsNumberAsString = in.nextLine();

        try {
            this.roundsNumber = Integer.parseInt(roundsNumberAsString);

            if (this.roundsNumber < 1 || this.roundsNumber > 10) {
                throw new WrongNumberOfRoundsException();
            }

        } catch (NumberFormatException e) {
            System.out.println("Wrong input !");
            askForRoundsNumber();

        } catch (WrongNumberOfRoundsException e2) {
            System.out.println("Wrong number of rounds !");
            askForRoundsNumber();
        }
    }

    private void showRules() {
        System.out.println("Rules of the game are simple. \n" +
                "Every round you and your computer simultaneously choose to play rock, paper or scissors.\n" +
                "Rock crushes scissors, paper covers rock and scissors cut paper.\n\n" +
                "To play use your keyboard. During the game press:\n\n" +
                "1 to play rock,\n" +
                "2 to play paper,\n" +
                "3 to play scissors.\n\n" +
                "After the game is over, press:\n\n" +
                "x to finish playing or\n" +
                "n to start a new game.\n");
    }

    private PlayerChoise getPlayerChoose(){

        try {
            return PlayerChoise.valueOf(in.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong input. Try again");
            return getPlayerChoose();
        }
    }

    private void play() {

        int roundCounter = 0;
        playerScore = 0;
        computerScore = 0;

        do {

            roundCounter++;
            System.out.println("Round " + roundCounter);

            System.out.println("Your turn! You play: ");


            playerMove = getPlayerChoose();

            switch (playerMove){
                case ROCK:
                    System.out.println();
                case PAPPER:
                    System.out.println();
                case SCISSORS:
                    System.out.println();
            }

            computerMove = randomMove.nextInt(3) + 1;
            if (computerMove == 1) {
                System.out.println("Computer played rock.");
            } else if (computerMove == 2) {
                System.out.println("Computer played paper.");
            } else {
                System.out.println("Computer played scissors.");
            }


            int playerMoveAsInt = Integer.parseInt(playerMove);

            if (playerMoveAsInt == computerMove) {
                System.out.println("Round " + roundCounter + " finished with a draw.");
                playerScore++;
                computerScore++;
            } else if ((playerMoveAsInt == 1 && computerMove == 3) || (playerMoveAsInt == 2 && computerMove == 1)
                    || (playerMoveAsInt == 3 && computerMove == 2)) {
                System.out.println("You won round " + roundCounter + "!");
                playerScore++;
            } else {
                System.out.println("Computer won round " + roundCounter + ".");
                computerScore++;
            }

            System.out.println("After round " + roundCounter + " your score is " + playerScore +
                    ". Computer's score is " + computerScore + ".\n");

        }while (roundCounter < roundsNumber);

    }

    public void showResult() {

        System.out.println("GAME OVER");

        if (playerScore == computerScore) {
            System.out.println("Result: a draw!");
        } else if (playerScore > computerScore) {
            System.out.println("You're the winner!");
        } else {
            System.out.println("Computer won!");
        }

        System.out.println("Your final score: " + playerScore + "\nComputer's final score: " + computerScore);

        System.out.println("\n Would you like to play again? Type n to start a new game or x to quit.\n");
        while (true) {
            String decision = in.next();
            if (decision.equals("x")) {
                System.out.println("Your game is over. Thank you for playing, " + playerName +
                        "." + "See you next time!");
                break;
            } else if (decision.equals("n")) {
                RpsRunner.main(null);
                break;
            } else {
                System.out.println("Oops! I don't understand \"" + decision + "\". " +
                        "Please type n for a new game or x to quit.");
                break;
            }
        }
    }

    public static void main(String[] args) {

        RpsRunner rpsRunner = new RpsRunner();

        rpsRunner.askForName();
        rpsRunner.askForRoundsNumber();
        rpsRunner.showRules();
        rpsRunner.play();
        rpsRunner.showResult();
    }

}
