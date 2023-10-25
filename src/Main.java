import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(); // create a Random object called rnd.
        int rndBirthMonthOff = rnd.nextInt(12); // generates a random value from 0 – 11
        int rndBirthMonth = rnd.nextInt(12) + 1; // What we want: 1 -12 so we shift it by adding 1
        int dieOff = rnd.nextInt(6); // generates a random int between 0 and 5
        int die = rnd.nextInt(6) + 1; // generates a random int between 1 and 6 what we want for dice

        int points = 0;
        int die1 = 0;
        int die2 = 0;
        int crapsRoll = 0;
        boolean gameOver = false;
        boolean done = false;
        String roll = "";
        String rightInput = "R";
        boolean rolled = false;
        boolean donePlayin = false;
        boolean valid = false;

        do {
            do {
                do {
                    System.out.println("Roll the dice with R key");
                    Scanner in = new Scanner(System.in);
                    roll = in.nextLine();
                    if (roll.equalsIgnoreCase(rightInput)) {
                        rolled = true;
                        die1 = rnd.nextInt(6) + 1;
                        System.out.println("Dice 1: " + die1);
                        die2 = rnd.nextInt(6) + 1;
                        System.out.println("Dice 2: " + die2);
                    } else {
                        System.out.print("invalid input");
                    }
                    crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice
                    String playAgain = "";
                    if (crapsRoll == 2) {
                        System.out.println("craps");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlayin = true;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlayin = false;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 3) {
                        System.out.println("craps");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlayin = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlayin = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 12) {
                        System.out.println("craps");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlayin = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlayin = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 7) {
                        System.out.println("natural");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlayin = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlayin = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 11) {
                        System.out.println("natural");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlayin = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlayin = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else {
                        points = points + crapsRoll;
                        System.out.println("Your points: " + points);
                    }
                }
                while (!donePlayin);
            }
            while (!rolled);
        }
        while (!gameOver);
    }
}
