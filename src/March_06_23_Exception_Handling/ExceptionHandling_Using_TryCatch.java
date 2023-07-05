package March_06_23_Exception_Handling;

public class ExceptionHandling_Using_TryCatch {
    public static void main(String[] args) {
        int A = 10;      //Normal Statement
        int B = 0;       //Normal Statement
        int result = 0;
        try {     //Risky code: Using a single statement
            result = A / B;      //Critical Statement (Our focus)
            System.out.println("In try block");
        }
        catch (Exception e)     //Handling Logic: catching the exception
        {
            System.out.println("Something went wrong..." + e);   //Something went wrong...java.lang.ArithmeticException: / by zero

        }
        System.out.println(result);
        System.out.println("Code Completed");
        /*
        There are two types of statements:
        1. Normal
        2. Critical
         */

        /*
        In one try block, what if we have different-different types of exceptions?
         */

        /*
        Keypoint's: By using 'try and Catch' block, we have learnt how to handle the 'Exception.'
         */
    }
}
