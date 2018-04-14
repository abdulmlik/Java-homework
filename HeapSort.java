/*
/////////// ********************************************************************************************* \\\\\\\\\\\
|                     This program arranges the matrix by heapsort                                              |
|                                                                                                                   |
|                                         Written by Abdulmalik Ben Ali                                             |
\\\\\\\\\\\ ********************************************************************************************* ///////////
*/
package heapsort;

/**
 *
 * @author Abdulmalik
 */
import java.util.*;
 
public class HeapSort {
 
   private static Object[] aheap;
   private static int size;
   
   public static void buildheap(Object[] aheap) {
      size = aheap.length-1;
      for(int i=size/2; i>=0; i--){
         maxheapify(aheap,i);
      }
   }
 
   public static void maxheapify(Object[] aheap, int i) { 
      int left = 2*i;
      int right = 2*i+1;
      int largest;
      if(left <= size && (int)aheap[left] > (int)aheap[i]){
         largest=left;
      } else {
         largest=i;
      }
      if(right <= size && (int)aheap[right] > (int)aheap[largest]) {
         largest=right;
      }
      if(largest!=i) {
         exchange(i, largest);
         maxheapify(aheap, largest);
      }
   }
 
   public static void exchange(int i, int j) {
        Object t = aheap[i];
        aheap[i] = aheap[j];
        aheap[j] = t; 
   }
 
   public static void heapsort(Object[] myarray) {
      aheap = myarray;
      buildheap(aheap);
      for(int i=size; i>0; i--) {
         exchange(0, i);
         size = size - 1;
         maxheapify(aheap, 0);
      }
   }
 
   public static void main(String[] args) {
      Object []array={2 ,4 ,5 ,55 ,6 ,88,20,5};
      System.out.println(Arrays.toString(array));
      heapsort(array);
      System.out.println(Arrays.toString(array));
   }
}