package Chapter3;

import java.util.Scanner;

/**
 * Program to display separate outputs of two different numbers to the console
 *
 * @author Quinten Scott
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double FirstNum;
        double SecondNum;
        System.out.println("Enter a number betwwen 1 and 100:");
        FirstNum = input.nextDouble();
        System.out.println("Enter a number between 1 and 100:");
        SecondNum = input.nextDouble();

        if (FirstNum < SecondNum) {
            System.out.println("First number is less than Second number.");
        } else;

        if (FirstNum > SecondNum) {
            System.out.println("First number is greater than Second number");
        } else;

        if (FirstNum == SecondNum) {
            System.out.println("First number is equal to Second number.");
        } else;

        if (FirstNum <= SecondNum) {
            System.out.println("Frist number is less than or equal to the Second number.");
        } else;

        if (FirstNum != SecondNum) {
            System.out.println("First number is not equal to Second number.");
        } else;

        if (SecondNum == 0) {
            System.out.println("Number can't divided by 0.");
        } else if ((FirstNum / SecondNum) < 1) {
            System.out.println("Proper Function.");
        } else {
            System.out.println("Improper Function.");
        }

        if (FirstNum >= 90) {
            System.out.println("A");
        } else if (FirstNum >= 80) {
            System.out.println("B");
        } else if (FirstNum >= 70) {
            System.out.println("C");
        } else if (FirstNum >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if ((SecondNum > 1) && (SecondNum < 100)) {
            System.out.println("Number is in Range.");
        } else {
            System.out.println("Out of Range.");
        }

    }
}
