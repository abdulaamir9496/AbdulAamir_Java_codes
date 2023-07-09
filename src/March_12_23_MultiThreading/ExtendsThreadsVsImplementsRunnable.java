package March_12_23_MultiThreading;
//Extends Threads Vs Implements Runnable And Limitations of invoking by Run() Explicitly,
//the Best way to practise is using Runnable interface If we have any requirements we can implement that class also
//In extends we can't extend more than 1 class in java as (Multiple inheritance is not allowed). So we should use Runnable interface
public class ExtendsThreadsVsImplementsRunnable {
    public static void main(String[] args) {

        //c.start();     //Don't call run method (it will act as single thread). Instead, call start it will register to Thread Scheduler for deciding which Thread to run/execute
        //m.start();     //Don't call run method (it will act as single thread). Instead, call start it will register to Thread Scheduler for deciding which Thread to run/execute

        //c.run();     //Single-Threading call for execution line of code
        //m.run();     //Single-Threading call for execution line of code

        //Best practise to use implements interface for achieving loose coupling and also have an option of extending a class as well.

    }
}
