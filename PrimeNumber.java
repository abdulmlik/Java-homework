/*
/////////// ********************************************************************************************* \\\\\\\\\\\
|                     This program to find the 500 prime numbes > 10000000                                          |
|                                                                                                                   |
|                                         Written by Abdulmalik Ben Ali                                             |
\\\\\\\\\\\ ********************************************************************************************* ///////////
*/
package primenumber;
import java.math.BigInteger;

    
/**
 *
 * @author Abdulmalik
 */
public class PrimeNumber {
    
    public static void main(String[] args) {
        
        BigInteger p;
        p = new BigInteger("10000000"); // number for start
        int end = 500; // number of prime numbes
        System.out.println("The 500 prime numbers > 10,000000 : ");
        for(int i = 0 ; i < end ; p = p.add(BigInteger.ONE))
        {
            if( isprime(p) )
            {
                System.out.println(" "+ p);
                i++;
            }
        }
    }//end main
    
    public static BigInteger sqrt(BigInteger x)
    {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        // Loop until we hit the same value twice in a row, or wind
        // up alternating.
        for(;;)
        {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }//end for
    }//end sqrt

    public static boolean isprime(BigInteger num)
    {
        BigInteger limit = sqrt(num);
	for(BigInteger i = new BigInteger("2") ; i.compareTo(limit) <= 0 ; i = i.add(BigInteger.ONE))
        {
            if( num.mod(i).equals(BigInteger.ZERO) )
            {
                return false;
            }
        }
	return true;
    } //end isprime
 }