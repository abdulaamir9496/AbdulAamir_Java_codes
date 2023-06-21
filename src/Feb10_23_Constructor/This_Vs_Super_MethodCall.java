package Feb10_23_Constructor;

class Student2  //If java classes don't have any parent class.
// By default, it will EXTENDS object class(means: It will have object with parent name)
{
    private int age;
    private String name;

    public Student2()
    {
        //Even if we write or not behind the scene when program get executed, So at that time
        // super method call will be included. Its work is simple to call parent class(super class)
        //If we don't call anything it will consider by DEFAULT for "super() method".
        //super() or this() should be in the first line. It won't work if it in somewhere else in the middle lines.
        //super();  DEFAULT
        this("Adult", 22);
        System.out.println("Default Constructor is called");
        name = "Childhood";
        age = 11;
    }
    public Student2(String name)
    {
        //If super() method is there then this() method will not be called. VISE-VERSA.
        this();  //
        System.out.println("Single parameterized Constructor is called");
        this.name = name;
        age = 16;
    }
    public Student2(String name, int age)
    {
        System.out.println("Double parameterized Constructor is called");
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class This_Vs_Super_MethodCall {
    public static void main(String[] args) {

        Student2 st1 = new Student2();
        st1.display();

        Student2 st2 = new Student2("Teenager");
        st2.display();

        Student2 st3 = new Student2("Adult", 22);
        st3.display();

    }
}
