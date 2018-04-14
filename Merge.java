/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge;
import java.util.Arrays;

/**
 *
 * @author Abdulmalik
 */
public class Merge {

    public static void main(String[] args) {
        int[] array1 = {2 ,4 ,5 ,55 ,6 ,88,20,5};
        int[] array2 = {52 ,43 ,2 ,5 ,76 ,3,67,2,30,27};
        int[] array3;
        //array3 = new int[array1.length + array2.length];
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        array3 = merge(array1,array2);
        
        System.out.print("Array 1 : ");  
        for(int val : array1)
        {
            System.out.print(val+ "  ");        
        }
        System.out.println();
        
        System.out.print("Array 2 : ");  
        for(int val : array2)
        {
            System.out.print(val+ "  ");        
        }
        System.out.println();
        
        System.out.println("Array 3 : " + Arrays.toString(array3));
    }
    
    public static int[] merge(int[] a, int[] b)
    {
        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)  
           answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];

        while (i < a.length)  
            answer[k++] = a[i++];


        while (j < b.length)    
            answer[k++] = b[j++];

        return answer;
    }
    
}
