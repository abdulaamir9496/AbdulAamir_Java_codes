package Feb20_23_Java_OOPs;

class AeroPlane
{
    public void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }

}
class CargoPlane extends AeroPlane
{
    public void fly()
    {
        System.out.println("cargoPlane fly at lower height");
    }
    public void carryGoods()
    {
        System.out.println("cargoPlane carries Goods");
    }
}
class PassengerPlane extends AeroPlane
{
    public void fly()
    {
        System.out.println("PassengerPlane fly at medium height");
    }
    void carryPassengers()
    {
        System.out.println("PassengerPlane carries Passengers");
    }
}
public class Inheritance_Overriding_SpecializedMethods {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.carryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.carryPassengers();

    }
}
