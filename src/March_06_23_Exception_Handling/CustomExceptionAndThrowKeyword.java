package March_06_23_Exception_Handling;
class MyException extends Exception     //creating our own exception
{
    public MyException(){}      //Constructor created for accepting default values
    public MyException(String msg)      //Constructor created for accepting String values (like: msg)
    {
        super(msg);
    }
}
public class CustomExceptionAndThrowKeyword {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -3;      //By using negative number (We should not divide number by negative number). Client says don't use negative values
        try {
            if (num2 < 0)
            {
                Exception e = new MyException("Negative number");   //Created own exception. We can also write Arithmetic Exception it will work.
                throw e;       //throw exception
            }
            else
            {
                int result = num1 / num2;
                System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number " + e);
        }
    }
}


//KEYPOINT: While working, we use very less creation of our own custom exceptions.