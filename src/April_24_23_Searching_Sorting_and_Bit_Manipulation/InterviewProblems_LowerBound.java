package April_24_23_Searching_Sorting_and_Bit_Manipulation;
/*
Modification of the binary search
Time complexity: O(log n)
Space complexity: O(1)
 */
import java.util.Scanner;
public class InterviewProblems_LowerBound {
    //Function definition
    public static int findFirstOccurrence(int[] arr, int target)
    {
        int low = 0, high = arr.length -1;
        int result = -1;
        
        while (low <= high) 
        {
            //to avoid overflow
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) 
            {
                result = mid;
                //traverse to the left side of an array
                high = mid - 1;
            } 
            else if (arr[mid] > target) 
            {
                high= mid - 1;
            } 
            else 
            {
                low = mid + 1;
            }   
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Enter the no of array in the element
        System.out.println("Enter the number of elements in an array: ");
        int n = scn.nextInt();
        
        //Creating an empty array
        int[] arr = new int[n];
        
        //Enter the elements in an array
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        //Enter the target element
        System.out.println("Enter the target element: ");
        int target = scn.nextInt();
        
        //Function calling
        int result = findFirstOccurrence(arr, target);
            if(result == -1)
            {
                System.out.println("Target element of First Occurrence is not present in the array!");
            }
            else
            {
                System.out.println("Target element of First Occurrence present in the index: " + result);
            }
    }
}
