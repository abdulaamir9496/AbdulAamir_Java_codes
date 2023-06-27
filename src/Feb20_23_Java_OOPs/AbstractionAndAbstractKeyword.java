package Feb20_23_Java_OOPs;
abstract class AeroPlane2     //not 100% abstraction, It is impure abstraction
{
    //abstract int age;     We cannot use abstract variable. Modifier 'abstract' not allowed here.
    //We cannot even create abstract constructor, reason being constructor will have body/ implementation. abstract means should not have body/ implementation.
    abstract public void takeoff();     //abstract method: such methods with only method signatures and without body

    abstract public void fly();     //abstract method: such methods with only method signatures and without body

    public void landing()     //Non-abstract method: which has body or implementation(not 100% abstraction, It is impure abstraction).
    {
        System.out.println("AeroPlane2 is landing");
    }
}
class CargoPlane2 extends AeroPlane2
{
    public void takeoff()
    {     //body/ implementation/ definition all are same
        System.out.println("CargoPlane2 requires longer size runway to takeoff");     //Overriding new: logic / implementation given
    }
    public void fly()
    {      //body/ implementation/ definition all are same
        System.out.println("CargoPlane2 flies at a lower height");     //Overriding new : logic / implementation given
    }
    public void alert()
    {     //Specialized method in a child class
        System.out.println("Alert.....");
    }
}
class PassengerPlane2 extends AeroPlane2
{
    public void takeoff()
    {     //body/ implementation/ definition all are same
        System.out.println("PassengerPlane2 requires medium size runway to takeoff");     //Overriding new: logic / implementation given
    }
    public void fly()
    {     //body/ implementation/ definition all are same
        System.out.println("PassengerPlane2 flies at a medium height");     //Overriding new: logic / implementation given
    }
}
class FighterPlane2 extends AeroPlane2
{
    public void takeoff()
    {      //body/ implementation/ definition all are same
        System.out.println("FighterPlane2 requires small size runway to takeoff");     //Overriding new: logic / implementation given
    }
    public void fly()
    {      //body/ implementation/ definition all are same
        System.out.println("FighterPlane2 flies at a high height");     //Overriding new: logic / implementation given
    }
}
public class AbstractionAndAbstractKeyword {
    public static void main(String[] args) {

        AeroPlane2 ref1 = new CargoPlane2();
        ref1.takeoff();     //Overridden method
        ref1.fly();      //Overridden method
        ref1.landing();      //Inherit method
        //ref1.alert();    //Specialised method cannot be directly accessed. Because ref1 is Parent's reference.
        // which is cargo's parent, by using parent class ref1 1. we can call child class Overridden method and Inherited methods.
        // But, we cannot directly call child class specialised methods. If we want to use specialised method we should use typeCasting(downCasting).
        //Temporarily changing the parent class reference 'ref1' behavior to 'child class'. In order to access 'specialised method'.
        ((CargoPlane2) ref1).alert();     //Using 'specialized method' via 'downCasting'.

        AeroPlane2 ref2 = new PassengerPlane2();
        ref2.takeoff();     //Overridden method
        ref2.fly();      //Overridden method
        ref2.landing();      //Inherit method

        AeroPlane2 ref3 = new FighterPlane2();
        ref3.takeoff();      //Overridden method
        ref3.fly();      //Overridden method
        ref3.landing();      //Inherit method

        //AeroPlane2 ref = new AeroPlane2();  //'AeroPlane2' is abstract; cannot be instantiated. We cannot create abstract class OBJECT.
        //abstract class means it has such a method which doesn't have body or implementation. Incomplete method means abstract class.

    }
}
