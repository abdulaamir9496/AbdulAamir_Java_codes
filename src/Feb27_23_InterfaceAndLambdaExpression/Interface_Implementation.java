package Feb27_23_InterfaceAndLambdaExpression;

import org.w3c.dom.ls.LSOutput;

interface C
{
    void disp();
}
interface E
{
    void disp1();
}
/*class D implements C  //Class 'D' must either be declared abstract or implement abstract method 'disp()' in 'C'
{
    *//*public void disp()
    {
        System.out.println("in show");
    }*//*
}*/
class D implements C, E    //class 'D' Implemented 2 interface, and we have to define 2 methods in this class.
{
    public void disp()      //method
    {
        System.out.println("in show");
    }
    public void disp1()      ////method
    {
        System.out.println("in show2");
    }
}
public class Interface_Implementation {
    public static void main(String[] args) {
        //C obj = new C();      //'C' is abstract; cannot be instantiated
        C obj = new D();
        obj.disp();
        //obj.disp1();  //ERROR when we use with P.class ref variable obj name with c.class ex: 'C obj = new D();'.

    }
}
