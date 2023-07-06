package March_06_23_Exception_Handling;
class Demo {
    public void a() throws Exception
    {
        b();
    }
    public void b() throws Exception
    {
        int num1 = 10;
        int num2 = 0;

        int result = num1 / num2;
        System.out.println(result);
    }
}
public class HandlingVsDuckingTheException {
    public static void main(String[] args)
    {
        Demo obj = new Demo();
        try
        {
            obj.a();
        }
        catch (Exception e)
        {
            System.out.println("Enter a number: " + e.getMessage());
        }
    }
}
