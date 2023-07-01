package Feb_25_23_LiveRevision;

import java.util.Calendar;

class Car        //Parent class / Target class
{
    private Engine eng;     //variable property
    public Car(Engine eng)      //constructor
    {
        this.eng = eng;
    }
    public void start()
    {
        eng.engineStart();
    }
}
class Engine      //object class dependent on car class
{
    public void engineStart()       //Method
    {
        System.out.println("Car Started");
    }
}
public class InheritanceUsing_DependencyInjection_Example {
    public static void main(String[] args) {

        Engine e = new Engine();
        Car c = new Car(e);
        c.start();
    }
}
