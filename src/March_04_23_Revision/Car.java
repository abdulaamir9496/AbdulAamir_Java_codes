package March_04_23_Revision;

public class Car
{
    class Engine      //inner class
    {
        void disp()
        {
            System.out.println("start");
        }
    }
    public static void main(String[] args) {

        Car car = new Car();
        Car.Engine eng = new Car().new Engine();

        eng.disp();
        eng.disp();
    }
}
