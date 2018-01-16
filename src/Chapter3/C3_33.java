package Chapter3;

import java.util.Scanner;

/**
 * Program to display the prices and weights of two different packages to the
 * console
 *
 * @author Quinten Scott
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // P is Price, W is Weight
        double packageOne;
        double packageTwo;
        int POneWt;
        int PTwoWt;
        System.out.println("Enter the Price of Package 1: ");
        packageOne = input.nextDouble();
        System.out.println("Enter the Weight of Package 1. : ");
        POneWt = input.nextInt();
        System.out.println("Enter the Price of Package 2. : ");
        packageTwo = input.nextDouble();
        System.out.println("Enter the Price of Package 2. : ");
        PTwoWt = input.nextInt();
        if (packageOne / POneWt > packageTwo / PTwoWt) {
            System.out.println("Package 2 is a Better Price. ");
        }
        if (packageOne / POneWt < packageTwo / PTwoWt) {
            System.out.println("Package 1 is a Better Price. ");
        } else {
            System.out.println("The two packages have the same price");
        }
    }

}
