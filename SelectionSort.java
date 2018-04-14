/*
/////////// ********************************************************************************************* \\\\\\\\\\\
|                     This program arranges the matrix by Selection Sort                                             |
|                                                                                                                   |
|                                         Written by Abdulmalik Ben Ali                                             |
\\\\\\\\\\\ ********************************************************************************************* ///////////
*/

package selectionsort;
import java.util.Scanner;

/**
 *
 * @author Abdulmalik
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\t\t Name           : عبدالملك مصطفى بن علي");
        System.out.println("\t\t\t Student Number : 213010551");
        
        System.out.println("ادخل حجم المصفوفة : ");
        int num;
        num = input.nextInt();
        int arr[] = new int[num];
        System.out.println("ادخل  " + num + " اعداد صحيحة");
        for(int i = 0 ; i < num ; i++){  
            arr[i] = input.nextInt();
        }
        System.out.print("not sorted array : [");
        for(int i = 0 ; i < num ; i++){  
            System.out.print(arr[i]);
            if(i != num-1)System.out.print(" , ");
        }
        System.out.println("]");
        int temp;
        for(int i = 0 ; i < num ; i++){  
            for(int j = i+1 ; j < num ; j++){  
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("sorted array : [");
        for(int i = 0 ; i < num ; i++){  
            System.out.print(arr[i]);
            if(i != num-1)System.out.print(" , ");
        }
        System.out.println("]");
        
        
    }
    
}
