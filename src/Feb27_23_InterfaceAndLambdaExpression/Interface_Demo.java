package Feb27_23_InterfaceAndLambdaExpression;
interface X
{
    void show();
}
interface Y
{
    void abc();
}
class B implements X, Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void abc()
    {
        System.out.println("in abc");
    }
}
public class Interface_Demo {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();
        obj.abc();
    }
}
