package Feb27_23_InterfaceAndLambdaExpression;
interface Computer      //In interface, we create a design and in class we implement how we want it.
// It is like a blueprint. In classes or c.classes we make as per our own requirement(In real time)
{
    void compileCode();
}
class Laptop implements Computer    //In classes or c.classes we make as per our own requirement(In real time)
{
    public void compileCode()
    {
        System.out.println("You got error: 911");
    }
}
class Desktop implements Computer     //In classes or c.classes we make as per our own requirement(In real time)
{
    public void compileCode()
    {
        System.out.println("You got error: 911 FASTER");
    }
}
class Developers      //class
{
    //Laptop obj = new Laptop();      //Now, only one obj is created even if we create multiple obj's in main class
    public void buildApp(Computer obj)      //method
    {
        System.out.println("Building Application");
        //Laptop obj = new Laptop();   //Whenever we create obj in main class a new Laptop obj is created.
        obj.compileCode();
    }
}
public class NeedOfInterfaceWithExample {
    public static void main(String[] args) {

        //Laptop obj = new Laptop();   //ERROR: in Developers class as obj is in c.class and obj is in m.class

        //Laptop obj = new Laptop();     //obj in m.class. So, no dependency on Developers

        Computer obj = new Desktop();

        Developers dev = new Developers();      //Obj
        dev.buildApp(obj);      //calling
        //dev.buildApp(obj);      //when we call obj one more time. additionally one more Laptop obj is created
    }
}
