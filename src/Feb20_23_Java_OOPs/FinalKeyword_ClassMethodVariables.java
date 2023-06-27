package Feb20_23_Java_OOPs;

/*final class Animal1 {  //final class: If final is used in parent class that cannot be used inherited in child class.
If we want to restrict the usage of 'class' we should finalize that class with 'final' keyword.
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}*/
class Animal1
{
    //final int age = 19;     //final variable: Used final keyword we cannot override or modify our values.
   final void sleep()
    {
        //age = 20;      //final variable: Used final keyword we cannot override or modify our values.
        System.out.println("Animal is sleeping");
    }
}
class Tiger1 extends Animal1
{
    /*void sleep()  //final method:  we cannot override in child class
    {
        System.out.println("Animals are hunting");
    }*/
}
public class FinalKeyword_ClassMethodVariables {
    public static void main(String[] args)
    {
        Tiger1 t1 = new Tiger1();
        t1.sleep();
        //t1.age;
    }
}