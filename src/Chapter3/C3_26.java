
package Chapter3;
import java.util.Scanner;


/**
 * Program to display separate outputs of two different integers to the console
 *
 * @author Quinten Scott
 */
public class C3_26
 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double userInp;
        System.out.println("Enter an integer: ");
        userInp = input.nextDouble();
        if ((userInp % 5 == 0) && (userInp % 6 == 0)) {
            System.out.println("Value can be divided by both");
        } else {
            System.out.println("Value cannot be divided by both");
        }

        if ((userInp % 5 == 0) || (userInp % 6 == 0)) {
            System.out.println("Value can be divided by one or the other");
        } else {
            System.out.println("value cannot be divided by one or the other");
        }
        if ((userInp % 5 == 0) ^ (userInp % 6 == 0)) {
            System.out.println("Value can be divided by one but not both");
        } else {
            System.out.println("Value cannot be divided by one but not both");
        }
    }

}
