package Chapter5;

import java.util.Scanner;

/**
 * Program to display a voting ballot to the console
 *
 * @author Quinten Scott
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vote = "";
        int yes = 0;
        int no = 0;

        while (!vote.equalsIgnoreCase("Q")) {
            System.out.println("Please enter Y to vote yes, or N to vote no, and "
                    + "Q to stop voting");
            vote = input.next();

            if (vote.equalsIgnoreCase("Y")) {
                yes++;
            } else if (vote.equalsIgnoreCase("N")) {
                no++;
            } else if (vote.equalsIgnoreCase("Q")) {
                System.out.println("Yes votes: " + yes + "\nNo Votes: " + no);
            } else if (!vote.equalsIgnoreCase("Y") || !vote.equalsIgnoreCase("N")) {
                System.out.println("Invalid Input");
            }

        }
    }
}
