package May_01_23_Recursion;

import java.util.Scanner;

public class FindingOfFactorialUsingRecursion {
    //Defining function
    public static int FindingFactorial(int n)
    {
        int result = 0;
        //Base case condition
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //Recursive calls
        else
        {
            result = n * FindingFactorial(n -1);
        }
        return result;
    }
    public static void main(String[] args) {
        //Taking factorial input number
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number for finding factorial: ");
        int n = scn.nextInt();
        
        //Calling function
        int result = FindingFactorial(n);
        System.out.println("The factorial of given input is: " + result);
    }
}
