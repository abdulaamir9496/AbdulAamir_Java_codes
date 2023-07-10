package March_12_23_MultiThreading;

//Synchronization
class Car implements Runnable {
    /*synchronized public void run() {    //Method has been synchronized
        try {
            System.out.println(Thread.currentThread().getName() + "Got into the parking lot");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + "Got into the car");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + "Started driving the car");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + "Came back and parked the car");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("something went wrong");
        }
    }*/

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "Got into the parking lot");
            Thread.sleep(2000);

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "Got into the car");
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName() + "Started driving the car");
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName() + "Came back and parked the car");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("something went wrong");
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();

        t1.setName("Son - 1");
        t2.setName("Son - 2");
        t3.setName("Son - 3");
    }
}
