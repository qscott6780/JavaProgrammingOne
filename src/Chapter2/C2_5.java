package Chapter2;

import java.util.Scanner;

/**
 * Program to display the total of the users inputs to the console
 *
 * @author Quinten Scott
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double GratuityRate;
        double subtotal;
        double FinalGratuity;
        double total;

        System.out.println("Enter gratuity rate");
        GratuityRate = input.nextDouble();

        System.out.println("Enter subttal");
        subtotal = input.nextDouble();

        FinalGratuity = GratuityRate / 10;

        total = FinalGratuity + subtotal;

        System.out.println("The gratuity is" + FinalGratuity);

        System.out.println("The total is" + total);
    }

}
