
package Chapter4;
import java.util.Scanner;

/**
 * Program to display a comparison between two bidders to the console
 *
 * @author Quinten Scott
 */
public class P4
 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        System.out.println("Enter the name of the 1st bidder: ");
        System.out.println("How many hours of work are required to complete the job?: ");
        System.out.println("Price of the 1st bidder per hour?: ");
        Scanner input = new Scanner(System.in);
        String firstBidder = input.next();
        int firstHours = input.nextInt();
        double firstRate = input.nextDouble();
        System.out.println("Enter the name of the 2nd bidder!: ");
        System.out.println("How many hours of work are required to complete the job?: ");
        System.out.println("Price of the 2nd bidder per hour?: ");
        String secondBidder = input.next();
        int secondHours = input.nextInt();
        double secondRate = input.nextDouble();

        double firstHourCost = firstHours * firstRate;
        System.out.println("Their total cost for the first bidder: $"
                + firstHourCost);
        double secondHourCost = secondHours * secondRate;
        System.out.println("Their total cost for the second bidder: $"
                + secondHourCost);

        if (firstHourCost < secondHourCost) {
            System.out.printf("\nWinner is %s, with total cost of $%.2f ",
                     firstBidder, firstHourCost);
        }
        if (secondHourCost < firstHourCost) {
            System.out.printf("\nWinner is %s, with total cost of $%.2f ",
                     secondBidder, secondHourCost);
        }
        if (firstHourCost == secondHourCost && firstHours < secondHours) {
            System.out.printf("\nWinner is %s, with total cost of $%.2f "
                    + "and total of %d hours.", firstBidder, firstHourCost,
                     firstHours);
        }
        if (firstHourCost == secondHourCost && secondHours < firstHours) {
            System.out.printf("\nWinner is %s, with total cost of $%.2f "
                    + "and total of %d hours.", secondBidder,
                     secondHourCost, secondHours);
        }
        if (firstHourCost == secondHourCost && firstHours == secondHours) {
            System.out.printf("\n%s and %s have identical bids. The hours "
                    + "required are %d and the total cost is"
                    + " $%.2f at $%.2f per hour.", firstBidder, secondBidder, firstHours,
                     firstHourCost, firstRate);
        }
    }
}

