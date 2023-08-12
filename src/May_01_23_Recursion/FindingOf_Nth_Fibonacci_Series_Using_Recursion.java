package May_01_23_Recursion;

import java.util.Scanner;

public class FindingOf_Nth_Fibonacci_Series_Using_Recursion {
    //Defining Function
    public static int findingFibonacci(int n)
    {
        //Base case condition
        int result = 0;
        if(n <= 1)
        {
            return n;
        }
        //Recurring calls
        else
        {
            result = findingFibonacci(n - 1) + findingFibonacci(n - 2);
        }
        return  result;
    }
    public static void main(String[] args) {
        //Taking input from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the nth number in fibonacci series: ");
        int n = scn.nextInt();
        
        //Calling Function
        int result = findingFibonacci(n);
        System.out.println("The result of nth fibonacci series is: " + result);
        
    }
}
