package July20_23_System_Desing.Singleton_Design_Pattern;
//Create only one singleton object
public class Fruits {
    //Constructor is used to create an object
    //If the Fruits is public anyone can create an object outside the class as well.
    //so we can't keep it public. We have to keep it private
    private Fruits()
    {
        //This Constructor is restricted to create only 1 'object'
    }
    public static Fruits getFruits()
    {
        Fruits fruits = new Fruits();
        return fruits;
    }
}
