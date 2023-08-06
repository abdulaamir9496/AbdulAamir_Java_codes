package April_24_23_Searching_Sorting_and_Bit_Manipulation;

import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr, int target)
    {
        int low = 0, high = arr.length -1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Size of an element from the user
        System.out.println("Enter the number of elements present in the array: ");
        int n = scn.nextInt();

        //Array elements entered from the user
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        //target element from the user
        System.out.println("Enter the target element: ");
        int x = scn.nextInt();
        
        //Function calling of binary search
        int result = binarySearch(arr, x);
        
        if(result == -1)
        {
            System.out.println("Searched element not found in the array");
        }
        else
        {
            System.out.println("Searched element found in the array location: " + result);
        }
    }
}
