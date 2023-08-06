package April_24_23_Searching_Sorting_and_Bit_Manipulation;

import java.util.Arrays;

public class Sorting_InsertionSort {
    //Implementation of insertion order
    public static void insertionOrder(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1])
            {
                //Swap between the elements arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                
                j--;
            }
        }
    }
    public static void main(String[] args) {
        //Defining array
        int[] arr = {20, 50, 25, 67, 79, 12, 15};
        
        //Function calling
        insertionOrder(arr);
        System.out.println("Insertion order is: ");
        System.out.println(Arrays.toString(arr));
    }
}
