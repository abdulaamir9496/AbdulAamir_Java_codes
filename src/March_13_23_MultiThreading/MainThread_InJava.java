package March_13_23_MultiThreading;
//Main Thread in java
public class MainThread_InJava {
    public static void main(String[] args) {
        System.out.println("Main Thread");   //created by JVM 1 main thread

        /*String name = Thread.currentThread().getName();    //in multiple line
        System.out.println(name);       //main*/

        System.out.println("Before changing");
        System.out.println("The name of main thread is: " + Thread.currentThread().getName());   //in single line
        System.out.println("The priority of main thread is: " + Thread.currentThread().getPriority());    //5

        System.out.println("After changing");
        Thread t = Thread.currentThread();
        t.setName("Aamir");
        t.setPriority(1);

        System.out.println("The name of main thread after changing name is: " + Thread.currentThread().getName());
        System.out.println("The priority of main thread after changing priority is:" + Thread.currentThread().getPriority());
    }
}
