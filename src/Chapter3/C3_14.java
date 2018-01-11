
package Chapter3;
import java.util.Scanner;

/**
 * Program to display the users output of a coin-flip to the console
 *
 * @author Quinten Scott
 */
public class C3_14
 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String [] args) {
	
	int CoinSide = (int)(Math.random() * 2);
	Scanner input = new Scanner(System.in);
	int userInp;
	System.out.println("0 (Heads) or 1 (Tails) : ");
	userInp = input.nextInt();
	if (CoinSide == userInp) {
	System.out.println("correct!");
	}

	else if (CoinSide != userInp) {
		System.out.println("incorrect");
	}

  }


}
