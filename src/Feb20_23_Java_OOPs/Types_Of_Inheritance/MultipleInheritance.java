package Feb20_23_Java_OOPs.Types_Of_Inheritance;

class Parent1
{
    int age = 18;
}
class Parent2
{
    int age = 22;
}
class Child extends Parent1 // Parent2
{
    //One child can have only one parent, but one parent can have multiple children
    //This is known not allowed in java. This kind of problem is also known as diamond shape problem
}
public class MultipleInheritance {
    public static void main(String[] args) {

    }
}
