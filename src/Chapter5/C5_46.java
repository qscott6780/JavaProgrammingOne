package Chapter5;

import java.util.Scanner;

/**
 * Program to display a reversed quote of the user's input to the console
 *
 * @author Quinten Scott
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Say what you need to say: ");

        String s = input.nextLine();
        System.out.println("Reversed it says: " + (new StringBuffer(s).reverse().toString()));
    }

}
