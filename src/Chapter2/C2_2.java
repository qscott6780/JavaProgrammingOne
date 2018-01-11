
package Chapter2;
import java.util.Scanner;

/**
 * Program to display the area and volume of a sphere to the console
 *
 * @author Quinten Scott
 */
public class C2_2
 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

        public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
        double area;
        double volume;
        double radius;
        double length;
             
            System.out.println("Enter the radius");
            radius = input.nextDouble();
            
            System.out.println("Enter the length");
            length = input.nextDouble();
                
                area = radius * radius * 3.1415;
                volume = area * length;
                System.out.println(area);
                System.out.println(volume);
    }
}
