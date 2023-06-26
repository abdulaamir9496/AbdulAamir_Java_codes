package Feb20_23_Java_OOPs;

class Demo1     //Parent class
{
    int a, b;    //Instance variable
    public Demo1()    //Default Constructor
    {
        //Default parent class of Demo1 parent class is OBJECT class. If it is not defined.
        System.out.println("Parent class Default Constructor");
    }
    Demo1(int x, int y)    //Parameterized constructor
    {
        System.out.println("Parent class Parameterized constructor");
        a = x;
        b = y;
    }
}
class Demo2 extends Demo1      //Child class
{
    int m, n;    //Instance variable
    public Demo2()    //Default Constructor
    {
        //super(10,20);  //Default consideration of super() method class if we write or if we don't write.
        this(10, 20);   //If we write this() method then super() method will not call/run.
        // But if we don't assign any method like super() or this().
        // Then it will consider default super() method by JVM.
        System.out.println("Child class Default constructor");
    }
    public Demo2(int x, int y)    //Parameterized constructor
    {
        //super();  //Default consideration of super() method class if we write or if we don't write.
        System.out.println("Child class Parameterized constructor");
        m = x;
        n = y;
    }
}
public class ConstructorExecutionInCaseOfInheritance {
    public static void main(String[] args) {
        //Demo1 d1 = new Demo1();     //Object created
        //Demo1 d2 = new Demo1();

        Demo2 d3 = new Demo2();     //Object created & calling constructor
        //Demo2 d4 = new Demo2(10,20);

    }
}
