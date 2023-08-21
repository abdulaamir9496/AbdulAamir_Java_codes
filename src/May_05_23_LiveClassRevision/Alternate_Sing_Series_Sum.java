package May_05_23_LiveClassRevision;

import java.util.Scanner;

public class Alternate_Sing_Series_Sum {
    //Function definition
    public static int sum(int n)
    {
        //Base case condition
        if(n == 0)
        {
            return n;
        }
        //Recursive calls
        if(n % 2 == 0)
        {
            return sum(n-1) - n;
        }
        else
        {
            return sum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        int num = 0;
        //Taking input from the user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the element: ");
        num = scn.nextInt();
        
        //Function calling
        int result = sum(num);
        System.out.println("The alternate sign sum is: " + result);
    }
}
