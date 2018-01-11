
package Chapter2;
import java.util.Scanner;

/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Quinten Scott
 */
public class P2
 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
        double subtotal;
        double dessert;
        double drink;
        double meal;
        double FinalTotal;
        double tax;
        double tip;
             
            System.out.println("Enter price of drink");
            drink = input.nextDouble();
            
            System.out.println("Enter price of meal");
            meal = input.nextDouble();
            
            System.out.println("Enter price of dessert");
            dessert = input.nextDouble();
                
                subtotal = drink + meal + dessert;
                tax = subtotal * .10;
                tip = (subtotal + tax) * .15;
                FinalTotal = subtotal + tax + tip;
                System.out.println("Your total is:");
                System.out.println(FinalTotal);
                
                System.out.println("The tax on your meal is:");
                System.out.println(tax);
                
                System.out.println("The 15% tip for your meal is:");
                System.out.println(tip);
                                
    }
}
