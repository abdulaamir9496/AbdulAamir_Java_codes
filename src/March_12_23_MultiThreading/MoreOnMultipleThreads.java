package March_12_23_MultiThreading;
import java.util.Scanner;
//More On Multiple Threads, (Light-Weighted Thread) Executing as per Thread Scheduler which ever is registered in TS

class Calc extends Thread     //Here we can't extend and can't make 2 classes as parent class as it is not allowed (multiple inheritance) in java. Highly recommended to use implements
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
class Message extends Thread
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
public class MoreOnMultipleThreads {
    public static void main(String[] args) {

        Calc c = new Calc();
        Message m = new Message();

        c.start();     //Don't call run method (it will act as single thread). Instead, call start it will register to Thread Scheduler for deciding which Thread to run/execute
        m.start();     //Don't call run method (it will act as single thread). Instead, call start it will register to Thread Scheduler for deciding which Thread to run/execute

        //c.run();     //Single-Threading call for execution line of code
        //m.run();     //Single-Threading call for execution line of code
    }
}
