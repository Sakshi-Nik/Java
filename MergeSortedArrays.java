//Ass 1
//Q.
import java.io.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 33, 5, 7};
        int[] arr2 = {22, 4, 61, 8};
        int n1 = arr1.length, n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
       
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        
      
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        
        
        System.out.print("Merged Sorted Array: ");
        for (int x = 0; x < mergedArray.length; x++) {
            System.out.print(mergedArray[x] + " ");
        }
    }
}
/*Output:
Merged Sorted Array: 1 22 4 33 5 7 61 8*/