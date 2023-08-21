package May_08_23_Backtracking_Interview_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_All_Sequences {
    public static void printSequences(int[] arr, int index, ArrayList<Integer> tempArr)
    {
        //Base case condition
        if(index == arr.length)
        {
            //Print the subsequence -- but don't print the empty entries
            if(tempArr.size() > 0)
            {
                System.out.println(tempArr);
            }
            //If we don't return, it will run infinitely. Which will consume our memory
            return;
        }
        //Recursive calls
        //Include
        printSequences(arr, index + 1, tempArr);
        
        //Add values in tempArr
        tempArr.add(arr[index]);
        
        //Do not include the values
        printSequences(arr, index + 1, tempArr);
        
        //Remove the last value
        tempArr.remove(tempArr.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        System.out.println("For the array1: " + Arrays.toString(arr1));
        printSequences(arr1, 0, new ArrayList<>());

        System.out.println();
        
        int[] arr2 = {1, 2, 3};
        System.out.println("For the array2:" + Arrays.toString(arr2));
        printSequences(arr2, 0, new ArrayList<>());
    }
}
