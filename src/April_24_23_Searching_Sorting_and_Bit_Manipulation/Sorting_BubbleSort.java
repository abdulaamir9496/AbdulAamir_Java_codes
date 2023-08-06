package April_24_23_Searching_Sorting_and_Bit_Manipulation;
import java.util.Arrays;
/*
Approach: Bubble Sort
Time complexity: O(n^2)
Space complexity: O(1)
 */
public class Sorting_BubbleSort {
    //
    public static void BubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            //For every iteration, we get the biggest element in the array at the end
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1])
                {
                    //Swap between arr[j], arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        //Defining array
        int[] arr = {20, 50, 10, 12, 45, 67, 90};
        
        //Function calling
        BubbleSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
