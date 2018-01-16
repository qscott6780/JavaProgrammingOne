package Chapter5;

import java.util.Scanner;

/**
 * Program to display a game of "Rock, paper, Scissors" to the console
 *
 * @author Quinten Scott
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int Win = 0;
        int Lose = 0;
        Scanner input = new Scanner(System.in);
        int Com = (int) (Math.random() * 4);
        do {
            System.out.print("Let's play rock, paper, scissors 0 for Rock, 1 for paper, and 2 for scissors");
            int playerGuess = input.nextInt();
            int compGuess = (int) (Math.random() * 3);
            switch (playerGuess) {
                case 0:
                    if (compGuess == 0) {
                        System.out.println("Tie");
                    } else if (compGuess == 1) {
                        System.out.println("You lost");
                        Lose++;
                    }
                    if (compGuess == 2) {
                        System.out.println("You won");
                        Win++;
                    }
                    break;
                case 1:
                    if (compGuess == 0) {
                        System.out.println("You won");
                        Win++;
                    }
                    if (compGuess == 1) {
                        System.out.println("Tie");
                        Lose++;
                    } else if (compGuess == 2) {
                        System.out.println("You lost");
                    }
                    break;
                case 2:
                    if (compGuess == 0) {
                        System.out.println("You lost");
                    } else if (compGuess == 1) {
                        System.out.println("You won");
                        Lose++;
                    }
                    if (compGuess == 2) {
                        System.out.println("Tie");
                    }
                    break;
            }

        } while (Win <= 2 && Lose <= 2);

    }

}
