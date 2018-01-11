
package Chapter4;
import java.util.Scanner;

/**
 * Program to display whether one string is substring to another to the console
 *
 * @author Quinten Scott
 */
public class C4_22
 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

       public static void main(String [] args) {
    System.out.println("Enter string S1: " + "\nEnter string S2: ");
       Scanner input = new Scanner(System.in);
       String S1 = input.next();
       String S2 = input.next();
       
       if (S1.contains(S2))
           System.out.println(S2 + " is a substring of " + S1);
       else
           System.out.println(S2 + " is not a substring of " + S1);
   }

}
