package Static;

class Demo
{
    static void display1()
    {
        System.out.println("static display1");
    }
    void display2()
    {
        System.out.println("Non-Static display2");
    }
}
public class Static_2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display1();
        d.display2();
        Demo.display1();
    }
}
