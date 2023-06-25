package Feb20_23_Java_OOPs;

class LooneyToons
{
    public void DisneyChannel()
    {
        System.out.println("This public access modifier can be accessed anywhere");
    }
}
class TomJerry
{
    protected void CartoonNetworkChannel()
    {
        System.out.println("Protected access modifier can be accessed everywhere apart from 'outside Package & non-subclass");
    }
}
class BunnyBugs
{
    void PogoChannel()
    {
        System.out.println("Default access modifier can be accessed only within the same package anywhere");
    }
}
class Doraemon
{
    private void HungamaChannel()
    {
        System.out.println("Private access modifier can be accessed only within the same class in which it is created");
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        LooneyToons lt = new LooneyToons();
        lt.DisneyChannel();

        TomJerry tj = new TomJerry();
        tj.CartoonNetworkChannel();

        BunnyBugs bb = new BunnyBugs();
        bb.PogoChannel();

        Doraemon d = new Doraemon();
        //d.Hungama();  //Showing error as it is not allowed in Java.
    }
}

