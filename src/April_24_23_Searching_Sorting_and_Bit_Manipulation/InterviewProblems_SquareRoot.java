package April_24_23_Searching_Sorting_and_Bit_Manipulation;
import java.util.Scanner;
/*
Approach: Modified binary search
Time complexity: O(log n)
Space complexity: O(1)
 */
public class InterviewProblems_SquareRoot {
    public static int findSquareRoot(int num)
    {
        int low = 0, high = num, result = -1;
        //Modified binary search
        while (low<= high)
        {
            int mid = low + (high - low)/ 2;
            int val = mid * mid;
            
            if(val == num)
            {
                //Perfect square root
                return mid;
            }
            else if (val < num)
            {
                //Return floor value, In case the number is not a perfect square root. So we can return floor value
                result = mid;
                low = mid + 1;
            }
            else
            {
                //Not a perfect square root
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number which you want the square root: ");
        int num = scn.nextInt();
        
        //function calling
        int result = findSquareRoot(num);
        System.out.println("The square root of the given number is: " + result);
    }
}
