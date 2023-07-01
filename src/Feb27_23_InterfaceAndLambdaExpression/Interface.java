package Feb27_23_InterfaceAndLambdaExpression;

import java.util.Enumeration;

interface A      //It is same like creating a class. Instead of class we have to write interface
{
    //int num;   //ERROR: By default it becomes public, static, final. So, we have to give value at the same time.
    int num = 6;      //it is public, static, final
    /*public void show()
    {
    //We have to declare here else it will throw ERROR.
    //By Default methods in interface are public and abstract.
        //We cannot define method, but we have to declare it as shown below.
    }*/
    void show();      //method in interface
}
public class Interface {
    public static void main(String[] args) {
        //System.out.println(num); //ERROR: as num is in interface 'A' and we are trying to use it in main class.
//For using 'A' we have to create obj of it. but, we cannot create obj in interface.
        //By Default num variable is public, static, final. Even no need to write it specifically.
//We can use it with the help of interface name. As shown below

        System.out.println(A.num);
        //we cannot change the value of num. It gives ERROR.
        //A.num = 9;  ERROR: Cannot assign a value to final variable 'num'.

        //Can we create obj?
        //A obj = new A();      //'A' is abstract; cannot be instantiated
        //Then how to use & how to define?
    }
}
