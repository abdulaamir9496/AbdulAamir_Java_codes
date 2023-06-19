package Static;

class Demo1 {
    static int a;
    static int b;

    int m;  //instance variable/ object variables/ fields/ properties
    int n;

    static
    {
        a = 10;
        b = 20;
        System.out.println("control in static block");
    }
    {
        //java initialization block
        m = 100;
        n = 50;
        System.out.println("Control in Non-static block or Initialization block");
    }
    static void display1()
    {
        System.out.println("value of static variable: " + a);
        System.out.println("value of static variable: " + b);
        //System.out.println(m);  //Non-static field 'm' cannot be referenced from a static context
    }
    void display2()
    {
        System.out.println("value of Non-static variable or Instance variable: " + m);
        System.out.println("value of Non-static variable or Instance variable: " + n);
    }
}
public class static_Project {
    public static void main(String[] args) {

        //int a;  //Writing inside a main method block/ can't use outside this block.
        // It won't work outside this block.

        Demo d = new Demo();
        Demo.display1();
        d.display2();
    }
}
