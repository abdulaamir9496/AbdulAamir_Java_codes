package Feb20_23_Java_OOPs;

class Animals
{
    public void eat()
    {
        System.out.println("Animals eat everyday");  //Overridden
    }
    public void age(int x)
    {
        System.out.println("Animals age is");
    }
}
class Tiger extends Animals  //Firstly, Inherited from parent
{
    public void eat()
    {
        System.out.println("Tiger hunts and eats");   //Secondly, Overriding as per requirement
    }
    /*public int age()
    {
        return 10;
    }*/
    public void age(int x)
    {

    }
}
public class Rules_Of_OverrideMethod_In_ChildClass {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        t.age(10);
    }
}

