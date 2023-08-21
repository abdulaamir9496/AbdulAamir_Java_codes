package May_01_23_Recursion;
import java.util.Scanner;
public class IntroductionToRecursion {
    public static int factorialFinding(int n)
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
            result = n * factorialFinding(n - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find out: ");
        int n = scn.nextInt();
        
        //Function calling
        int result = factorialFinding(n);
        System.out.println("Factorial of a given number enter by user is: " + result);
    }
}
