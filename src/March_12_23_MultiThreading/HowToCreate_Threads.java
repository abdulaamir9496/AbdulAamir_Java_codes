package March_12_23_MultiThreading;
//How to create Threads?
class MyThread extends Thread {      //All Thread properties and behavior have been inherited in MyThread
    public void run() {
        System.out.println("Child Thread");
    }
}
public class HowToCreate_Threads {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        MyThread mt = new MyThread();     //object of MyThread
        mt.start();     //No need to call run() method separately. We need to call with start() method.
    }
}
