package Chapter6;

import java.util.Scanner;

/**
 * Program to display the conversion between Euro, Pounds, and Yen, to the US
 * Dollar
 *
 * @author Quinten Scott
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resp, type;
        double amount;
        System.out.println("Conversion rate for Euros to US Dollar : ");
        double ed = input.nextDouble();
        System.out.println("Conversion rate for Pound to US Dollar : ");
        double pd = input.nextDouble();
        System.out.println("Conversion rate for Yen to US Dollar : ");
        double yd = input.nextDouble();

        do {
            System.out.println("Enter the amount of US Dollar Converting : ");
            amount = input.nextDouble();
            System.out.println("Enter Y for Yen,  P for Pound, or E for Euro : ");
            type = input.next();
            if (type.equalsIgnoreCase("P")) {
                System.out.printf(" %.2f USD is %.2f %s. \n", amount, convert(pd, amount), type);
            } else if (type.equalsIgnoreCase("Y")) {
                System.out.printf("%.2f USD is %.2f %s. \n", amount, convert(yd, amount), type);
            } else if (type.equalsIgnoreCase("E")) {
                System.out.printf("%.2f USD is %.2f %s. \n", amount, convert(ed, amount), type);
            }

            do {
                System.out.println("More Conversions? (y for Yes or n for No):");
                resp = input.next();
            } while (!resp.equalsIgnoreCase("n") && !resp.equalsIgnoreCase("y"));
        } while (resp.equalsIgnoreCase("y"));
    }

    /**
     * This method is used to display what the user wants to convert, the
     * conversion, and also asks whether the user wants to convert anymore
     * currencies.
     *
     * @param rate the rate of each currency
     * @param amount the amount that the user has entered
     * @return When the user has decided that they do not want to convert
     * currencies anymore
     */
    public static double convert(double rate, double amount) {
        double csh, ttl, money;
        if (amount <= 100) {
            ttl = amount - (amount * 0.1);
            money = ttl * rate;
        } else {
            ttl = amount - (amount * 0.05);
            money = ttl * rate;
        }
        csh = money;
        return csh;
    }
}
