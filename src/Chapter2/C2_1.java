package Chapter2;

import java.util.Scanner;

/**
 * Program to display the temperature in Fahrenheit to the console
 *
 * @author Quinten Scott
 */
public class C2_1 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.println("Enter temp...");
        celsius = input.nextDouble();

        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(fahrenheit);

    }

}
