package April_24_23_Searching_Sorting_and_Bit_Manipulation;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Taking the size of an element from the user
        System.out.println("Enter the no of elements present in an array: ");
        int n = scn.nextInt();

        //array elements entered from the user
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        //target element from the user
        System.out.println("Enter target element: ");
        int x = scn.nextInt();

        //implementation of linear search
        int idx = -1;
        for (int i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                idx = i;
                break;
            }
        }
        if(idx == -1)
        {
            System.out.println("Searched element is not found in the array");
        }
        else
        {
            System.out.println("Searched element is found in the array location: " + idx);
        }
    }
}
