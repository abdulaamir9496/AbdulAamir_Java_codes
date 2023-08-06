package April_24_23_Searching_Sorting_and_Bit_Manipulation;
import java.util.Arrays;
/*
Approach: Selection Sort
Time Complexity: O(n^2)
Space Complexity: O(1)
 */     
public class Sorting_SelectionSort {
    public static void selectionSort(int[] arr) {
        //Implementation of insertion sort
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                //Swap the elements between the arr[j] and arr[j-1]
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
        selectionSort(arr);

        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
