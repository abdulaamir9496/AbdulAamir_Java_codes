package March_12_23_MultiThreading;

class Demo2 implements Runnable
{
    public void run()
    {
        System.out.println("child Thread is Executing");      //Running state
        try {
            Thread.sleep(3000);     //sleep method
        }  catch (Exception e)     //Running state continuous after completing a (sleep method) time lap
        {
            System.out.println("some problem");
        }
        System.out.println("Child Thread task completed");      //After execution this line of code it will go to (Dead state)
    }
}
public class JoinMethod_IsAliveMethod {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread is Started");
        Demo2 d2 = new Demo2();

        Thread th =new Thread(d2);
        System.out.println(th.isAlive());

        th.start();
        System.out.println(th.isAlive());

        th.join();

        System.out.println("Main Thread is Ended");
    }
}
