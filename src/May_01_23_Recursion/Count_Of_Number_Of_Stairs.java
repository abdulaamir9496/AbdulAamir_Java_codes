package May_01_23_Recursion;

import java.util.Scanner;

public class Count_Of_Number_Of_Stairs {
    //Defining Function
    public static int findCount(int n)
    {
        //Base case condition
        if(n <= 1)
        {
            return n;
        }
        //Recursive Calls
        else
        {
            return findCount(n -1) + findCount(n - 2);
        }
    }
    public static void main(String[] args) {
        //Taking input from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no.of Stairs: ");
        int n = scn.nextInt();
        
        //Calling Function
        int result = findCount(n + 1);
        System.out.println("The number of stair ways are: " + result);
    }
}
