package May_01_23_Recursion;
import java.util.Scanner;
public class Finding_Of_Power_Using_Recursion {
    //Defining Function
    public static long findingPower(long a, long b)
    {
        long mid = 0, result = 0, finalResult = 0;
        //Base case condition
        if(b == 1)
        {
            return a;
        }
        //Recurring calls
        else
        {
            mid = b/2;
            result = findingPower(a, mid);
            finalResult = result * result;
            
            if(b % 2 == 0)
            {
                return finalResult;
            }
            else
            {
                return a * finalResult;
            }
        }
    }
    public static void main(String[] args) {
        //Taking input from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        long a = scn.nextInt();
        System.out.println("Enter the value of b: ");
        long b = scn.nextInt();
        
        //Calling Function
        long result = findingPower(a, b);
        System.out.println("The result of a^b is: " + result);
    }
}
