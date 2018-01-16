package Chapter6;

import java.util.Scanner;

/**
 * Program to display a password request/approval to the console
 *
 * @author Quinten Scott
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String output = "Correct Password";
        System.out.println("Please enter password ; ");
        String pass = input.next();
        if (checkLength(pass) == false) {
            System.out.println("A password must have at least eight characters");
            output = "Invalid Password";
        } else if (lettersAndDigits(pass) == false) {
            System.out.println("A password must consist of only letters and digits");
            output = "Invalid Password";

        } else if (containsTwoDigits(pass) == false) {
            System.out.println("A password must contain at least two digits");
            output = "Invalid password";
        }
        System.out.println(output);
    }

    /**
     * This method is the console output to tell the user whether their password
     * is valid or not, and what to do about it if it isn't valid.
     *
     * @param pass MEANS PASSWORD
     * @return Returns when the user has entered a password that fits in all of
     * the password parameters.
     */
    public static boolean checkLength(String pass) {
        if (pass.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method is used to check whether the password is at least eight
     * characters.
     *
     * @param pass MEANS PASSWORD
     * @return When the password is at least eight characters, the method
     * returns
     */
    public static boolean lettersAndDigits(String pass) {
        if (pass.contains("#")) {
            return false;
        } else if (pass.contains("!")) {
            return false;
        } else if (pass.contains(".")) {
            return false;
        } else if (pass.contains(",")) {
            return false;
        } else if (pass.contains("(")) {
            return false;
        } else if (pass.contains(")")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method is used to exclude passwords that contain incorrect
     * characters
     *
     * @param pass MEANS PASSWORD
     * @return It returns when the password fits in between the parameters set
     * for special characters.
     */
    public static boolean containsTwoDigits(String pass) {
        int counter = 0;
        for (int x = 0; x < pass.length(); x++) {
            if (Character.isDigit(pass.charAt(x))) {
                ++counter;
            }
        }
        if (counter >= 2) {
            return true;
        } else {
            return false;
        }
    }

}
