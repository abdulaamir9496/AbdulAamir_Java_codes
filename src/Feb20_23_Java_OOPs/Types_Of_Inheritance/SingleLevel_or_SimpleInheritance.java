package Feb20_23_Java_OOPs.Types_Of_Inheritance;

class Animal
{
    void sleep()
    {
        System.out.println("Animals need sleep");
    }
}

class Tiger extends Animal  //For building relation with parent class using "EXTENDS" keyword
{

}
public class SingleLevel_or_SimpleInheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();

    }
}
