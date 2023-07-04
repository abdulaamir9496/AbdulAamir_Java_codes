package Feb27_23_InterfaceAndLambdaExpression;

interface Car
{
    void drive();     //METHOD declared, but not defined
}
/*class Fortuner implements Car      //PURPOSE: This class purpose is to implement the INTERFACE
{       //implemented only once then why to use it.
    public void drive()      //METHOD declared & defined
    {      //method with implementation / body
        System.out.println("Driving...");
    }
}*/
public class Anonymous_InnerClass {
    public static void main(String[] args) {
        //Car obj = new Car();  'Car' is abstract; cannot be instantiated
        Car obj = new Car()      //obj created
        {  //defining METHOD within class OBJECT(we can't see where the class is?)
            // but it is known as ANONYMOUS INNER CLASS as it is inside the obj
            //can be used only once. Mostly used in LAMBDA EXPRESSION
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        obj.drive();      //calling obj for output
    }
}
