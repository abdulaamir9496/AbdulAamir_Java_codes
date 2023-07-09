package March_12_23_MultiThreading;
//States of Thread

class Demo1 implements Runnable
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
public class StatesOfThread {
    public static void main(String[] args) {

        System.out.println("Main Thread Started");     //Default Main Thread by TS by JVM

        Demo1 d1 = new Demo1();

        Thread t1 = new Thread(d1);      //Thread created. Thread is in (New state)

        t1.start();     //Task assigned. (Runnable state / Ready State)

        //If Thread is allocated by the THREAD SCHEDULER, it will be in (Running state)
        //When Thread is in (Running state) and if Thread encounter's (wait or sleep or join or
        // suspense method and also if required resources are not available) it can go in (Block state /Waiting state)
        //In block state Thread gets required resources or completes it wait/sleep times.
        // It will not continue from (Running state). But again it will go to (Runnable state)
        //Here now again TS will decide which Thread needs to be executed
        //After Thread is executed, it will go to (Dead State)

        //Keypoint: Thread can come back from (Running state) to (Runnable state) if it has encountered a yield() Method
        //Ex: if you have multiple threads with the same priority and want to execute one by one.
        // Then we can use (yield method) will discuss yield method in the future.
    }
}
