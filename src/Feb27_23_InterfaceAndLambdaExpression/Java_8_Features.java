package Feb27_23_InterfaceAndLambdaExpression;

interface a
{
    void show();
    default void config()      //we can define methods in java with the help of 'default' keyword
    {
        System.out.println("In config default (Non-Static) method");
    }
    static void abc()
    {
        System.out.println("In abc Static");
    }
}

class b implements a
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Java_8_Features {
    public static void main(String[] args) {
        a.abc();
        //a.config();      //non-static method config() cannot be referenced from a static context

        a obj = new b();
        obj.show();
        obj.config();

    }
}
