package March_13_23_MultiThreading;
//Creating Threads by Implementing Runnable Interface
//Best practise to use implements interface for achieving loose coupling and also have an option of extending a class as well.
import java.util.Scanner;

class Calc1 implements Runnable    //Here in 'Runnable interface' we can extend a class and implement an interface as well
{
    public void run()
    {
        System.out.println("Calculating task starting");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scn.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = scn.nextInt();

        int result = num1 + num2;
        System.out.println(result);

        System.out.println("Calculating task ended");
        System.out.println("****************************************************");
    }
}
class Message1 implements Runnable
{
    public void run()
    {
        System.out.println("Displaying important message task starting");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is very important while learning new things");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Some problem in execution");
            }
        }
        System.out.println("Displaying important message task ended");
        System.out.println("****************************************************");
    }
}
public class Threads_by_ImplementingRunnableInterface {
    public static void main(String[] args) {

        Calc1 c1 = new Calc1();     //No link with Threads directly so created Thread 'obj' separately
        Message1 m1 = new Message1();     //No link with Threads directly so created Thread 'obj' separately

        Thread t1 = new Thread(c1);     //Thread's obj created holding 'c1' information
        Thread t2 = new Thread(m1);     //Thread's obj created holding 'm1' information

        t1.start();      //Multi-Threading call for execution line of code
        t2.start();      //Multi-Threading call for execution line of code

        //t1.run();      //Single-Threading call for execution line of code
        //t2.run();      //Single-Threading call for execution line of code
    }
}

//Which method is best and safe to use by extending methods or by implementing methods? will see in the next program
