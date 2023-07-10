package March_13_23_MultiThreading;
//MultiThreading Revision Class

class Queue
{
    int x;
    boolean ValueInX = false;
    synchronized public void put(int j)
    {
        try
        {
            if(ValueInX)
            {
                wait();
            }
            else
            {
                x = j;
                System.out.println("I have produced value x: " + x);
                ValueInX = true;
                notify();
            }

        }
        catch (Exception e)
        {
            System.out.println("Kuch toh gadbad hai daya!");
        }
    }
    synchronized public void get()
    {
        try
        {
            if(!ValueInX)
            {
                wait();
            }
            else
            {
                System.out.println("I have consumed value x: " + x);
                ValueInX=false;
                notify();
            }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
class Producer extends Thread
{
    Queue q;
    Producer(Queue a)
    {
        q = a;
    }
    public void run()
    {
        int i = 1;
        while (true)
        {
            q.put(i++);
        }
    }
}
class Consumer extends Thread
{
    Queue q;
    Consumer(Queue b)
    {
        q = b;
    }
    public void run()
    {
        q.get();
    }
}
public class MultiThreading_RevisionClass {
    public static void main(String[] args) {

        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}
