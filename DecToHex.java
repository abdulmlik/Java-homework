/*
/////////// ********************************************************************************************* \\\\\\\\\\\
|                     This program converts the number of decimal to Hexa                                           |
|                                                                                                                   |
|                                         Written by Abdulmalik Ben Ali                                             |
\\\\\\\\\\\ ********************************************************************************************* ///////////
*/
package dectohex;
import java.util.Scanner;

/**
 *
 * @author Abdulmalik
 */
public class DecToHex {

    public static String DecimalToHexa(int dec)
    {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hex = "";
        while (dec != 0)
        {
            int rem = dec % 16;
            hex = hexDigits[rem] + hex;
            dec = dec / 16;
        }
        return hex;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\t\t Name           : عبدالملك مصطفى بن علي");
        System.out.println("\t\t\t Student Number : 213010551");
        
        System.out.print("Enter number integer : ");
        int decimal = input.nextInt();
        System.out.println(DecimalToHexa(decimal));
        
    }
    
}
