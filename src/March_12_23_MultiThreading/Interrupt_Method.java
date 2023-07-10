package March_12_23_MultiThreading;
//Interrupt Method

class Example implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Child Thread");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread has interrupted");
        }
    }
}

public class Interrupt_Method {
    public static void main(String[] args) {
        Example e = new Example();

        Thread td = new Thread(e);

        td.start();
        td.interrupt();
    }
}
