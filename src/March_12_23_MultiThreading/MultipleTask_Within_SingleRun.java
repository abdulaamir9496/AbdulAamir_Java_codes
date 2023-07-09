package March_12_23_MultiThreading;
import java.util.Scanner;
//Multiple Task Within SingleRun()
class MyThreads extends Thread
{
    public void run()
    {
        String tName = Thread.currentThread().getName();
        if(tName.equals("CALC"))
        {
            Calc2();
        } else
        {
            ImportantMessage();
        }
    }
    public void Calc2()
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
    public void ImportantMessage()
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
public class MultipleTask_Within_SingleRun {
    public static void main(String[] args) {

        MyThreads mt1 = new MyThreads();
        MyThreads mt2 = new MyThreads();

        mt1.setName("CALC");
        mt2.setName("PRINT");

        mt1.start();
        mt2.start();
    }
}
