package March_06_23_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryFinallyAndTryWithResources {
    public static void main(String[] args) {
        /*int num = 0;
        Scanner scn = new Scanner(System.in);
        try      //executes when there is no exception
        {
            num = scn.nextInt();
        }
        catch (InputMismatchException e)       //executes when there is exception
        {
            System.out.println("Enter a number: ");
        }
        finally     //Finally, will execute irrespective of there is exception or not.
        {     //In finally, every time we close some resources like: database connection, open file, Scanner object. It is always a good idea to close it.
            scn.close();
            System.out.println("Resource Closed");
        }
        System.out.println(num);*/

        //Try with resources:
        int num = 0;
        try (Scanner scn = new Scanner(System.in);)     //try block resource created and will close automatically
        {
            num = scn.nextInt();
            System.out.println("Enter a number: ");
        }
        System.out.println(num);
    }
}

//KEYPOINT: DRY Do not Repeat Yourself
/*
For executing/ running the code we need either 'catch block' or 'finally block'
We can't run 'catch block' without 'try block'
We can't write 'catch block and 'finally block' without 'try block'
'Catch block' is not compulsory. It is used to handle the situation.
Especially, in banking websites we see it will get automatically logged out when there is a power-cut.
If the main machine is off and the website is on. So, it will automatically get logged out.
 */