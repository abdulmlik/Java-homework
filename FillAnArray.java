
package fillanarray;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Abdulmalik
 */
public class FillAnArray {

    public static void main(String[] args) {
        int  n[],size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array : ");
        size = input.nextInt();
        n = new int[size];
        
        n = Fill(n);
        System.out.println("array random : " + Arrays.toString(n));
        
    }
    
    public static int[] Fill(int [] a)
    {
        Random rand = new Random();
        int c;
        for( int i = 0 ; i < a.length ; i++ )
        {
            c = rand.nextInt();
            a[i] = (c < 0)? c * -1: c;
        }
        return a;   
    }
    
}
