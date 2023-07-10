package March_13_23_MultiThreading;
//DeadLock
class Library implements Runnable
{
    String res1 = new String("JAVA");
    String res2 = new String("DSA");
    String res3 = new String("SQL");

    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("Student1"))
        {
            try
            {
                Thread.sleep(3000);   //Student1 went in waiting area/(Block state) because of (sleep method).
                // From sleep method it will go back to 'Runnable' Then TS will decide which one to execute 1st.
                synchronized (res1)      //After completing sleep method, Student1 taking resource1 and applying lock
                {
                    System.out.println("Student1 has acquired: " + res1);
                    Thread.sleep(3000);
                    synchronized (res2)     //Student1 taking resource2 and applying lock
                    {
                        System.out.println("Student1 has acquired: " + res2);
                        Thread.sleep(3000);
                        synchronized (res3)     //Student1 trying to take resource3 and applying lock but already taken by Student2.
                        // So Student1 again it will go to waiting/sleep method.
                        {
                            System.out.println("Student1 has acquired: " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("something went wrong");
            }
        }
        else
        {
            try
            {
                Thread.sleep(3000);     //Student1 went in waiting area/(Block state) because of (sleep method).
                // From sleep method it will go back to 'Runnable' Then TS will decide which one to execute 1st.
                synchronized (res3)      //After completing sleep method, Student2 taking resource3 and applying lock
                {
                    System.out.println("Student2 has acquired: " + res3);
                    Thread.sleep(3000);
                    synchronized (res2)     //Student2 trying to take resource2 and applying lock but already taken by Student1.
                    // So Student2 again it will go to waiting/sleep method.
                    {
                        System.out.println("Student2 has acquired: " + res2);
                        Thread.sleep(3000);
                        synchronized (res1)     //Student2 taking resource1 and applying lock
                        {
                            System.out.println("Student2 has acquired: " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("something went wrong");
            }
        }
    }
}
public class DeadLock {
    public static void main(String[] args) {
        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();

    }
}


//NOTE KEY POINTS:
// Student1 required 'resource3' which is acquired by Student2. Both are dependent on each other. It will go back and permanently stuck in block method.
// Student2 required 'resource2' which is acquired by Student1. Both are dependent on each other. It will go back and permanently stuck in block method.
//Due to the mutual dependency of the resources. It is known as "DeadLock."
//As a programmer, we have to write code in such a way that we never face "DeadLock." When we perform multiThreading.