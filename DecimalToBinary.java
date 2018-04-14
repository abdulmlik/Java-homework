/*
/////////// ********************************************************************************************* \\\\\\\\\\\
|                     This program converts the number of decimal to binary                                         |
|                                                                                                                   |
|                                         Written by Abdulmalik Ben Ali                                             |
\\\\\\\\\\\ ********************************************************************************************* ///////////
*/
package decimalToBinary;
import java.util.Scanner;
/**
 *
 * @author Abdulmalik
 */
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\t\t Name           : عبدالملك مصطفى بن علي");
        System.out.println("\t\t\t Student Number : 213010551");
        
        System.out.print("Enter number integer : ");
        int decimal = input.nextInt(); 
        StringBuilder Binary = new StringBuilder();

        do {
            Binary.append(decimal % 2);
            decimal = decimal / 2;
        } while (decimal > 0);

        System.out.println(Binary.reverse().toString()); //prints Binary Number
    }
    
}
