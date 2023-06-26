package Feb20_23_Java_OOPs;
class aeroPlane      //Parent class default parent is Object class
{
    public void takeoff()     //Overridden
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()      //Overridden
    {
        System.out.println("Aeroplane is flying");
    }
}
class cargoPlane extends aeroPlane      //Child class Inheriting Parent class
{
    public void takeoff()    //Overriding as per requirement
    {
        System.out.println("Cargo-plane requires longer size runway");
    }
    public void fly()    //Overriding as per requirement
    {
        System.out.println("Cargo-plane flies at lower height");
    }
}
class passengerPlane extends aeroPlane    //Child class Inheriting Parent class
{
    public void takeoff()      //Overriding as per requirement
    {
        System.out.println("Passenger-plane requires medium size runway");
    }
    public void fly()     //Overriding as per requirement
    {
        System.out.println("Passenger-plane flies at medium height");
    }
}
class fighterPlane extends aeroPlane     //Child class Inheriting Parent class
{
    public void takeoff()     //Overriding as per requirement
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()      //Overriding as per requirement
    {
        System.out.println("FighterPlane flies at high height");
    }
}
class Airport {      //Applying polymorphism
    public void polymorphism(aeroPlane ref) {  //All the Overridden methods are invoked by using parent class reference
        ref.takeoff();
        ref.fly();

        System.out.println("---------------------------------------------");
    }
}
public class IntroductionToPolymorphism {
    public static void main(String[] args) {

        cargoPlane cp = new cargoPlane();     //Child Object
        /*cp.takeoff();      //calling
        cp.fly();      //calling*/

        passengerPlane pp = new passengerPlane();     //Child Object
        /*pp.takeoff();      //calling
        pp.fly();      //calling*/

        fighterPlane fp = new fighterPlane();     //Child Object
        /*fp.takeoff();      //calling
        fp.fly();      //calling*/

        //AeroPlane ref;     //Parent with referenceVariable created. Have the capacity to hold child class address
        //pp=cp;     //ERROR: pp refVar is assigned to cp refVar, as both the refVar TYPE name is different.
        // Here the ref should be same for no error's. But it's(Child) ref can hold its Parent class ref.

        Airport ap = new Airport();    //Object
        ap.polymorphism(cp);      //cp: address, polymorphism: method
        ap.polymorphism(pp);      //cp: address, polymorphism: method
        ap.polymorphism(fp);      //cp: address, polymorphism: method
    }
}
