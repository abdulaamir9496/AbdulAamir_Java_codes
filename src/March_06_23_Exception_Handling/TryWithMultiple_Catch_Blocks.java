package March_06_23_Exception_Handling;

public class TryWithMultiple_Catch_Blocks {
    public static void main(String[] args) {
        int A1 = 10;
        int B1 = 10;
        int result = 0;
        int values [] = {3,6,7,8};
        String name = null;

        /*try {      //Using multiple statements
            result = A1 / B1;
        } catch (Exception e) {      //Exception is a SuperClass of all other exceptions
            System.out.println("Something went wrong..." + e);
        }
        System.out.println(result);
        System.out.println("Code completed");     //Something went wrong...java.lang.ArithmeticException: / by zero
*/

        try {      //Using multiple statements
            result = A1 / name.length();
            System.out.println(values[5]);
        } catch (ArithmeticException e)
        {       //ArithmeticException is a c.class
            System.out.println("" + e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong...");
        }
        System.out.println(result);
        System.out.println("Code completed");

    }
}
