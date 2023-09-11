package Problem_Solving_Interveiws_Tests;

import java.util.Scanner;

public class Print_IfEven_DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scn.nextInt();
        
        if(number % 2 == 0 && number % 3 == 0)
        {
            System.out.println("The number is even and divisible by 3: "+ number);
        }
        else
        {
            System.out.println("The number does not meet the criteria");
        }
    }
}
