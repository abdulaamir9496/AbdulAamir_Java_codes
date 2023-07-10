package Fundamentals_Of_Java_Arrays_OOPs;

class Calc1 {
    public void show(byte n) {
        System.out.println("byte" + n);
    }

    public void show(short n) {
        System.out.println("short" + n);
    }

    public void show(char n) {
        System.out.println("char" + n);
    }

    public void show(int n) {
        System.out.println("int" + n);
    }

    public void show(double n) {
        System.out.println("double" + n);
    }

}

public class AutomaticPromotion_In_MethodOverloading {
    public static void main(String[] args) {
        Calc1 obj = new Calc1();
        obj.show(2);
    }
}
