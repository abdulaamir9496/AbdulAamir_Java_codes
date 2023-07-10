package Fundamentals_Of_Java_Arrays_OOPs;

class Calc {
    public int add(int n1, int n2) {
        int result1 = n1 + n2;
        return result1;
    }

    public int add(int n1, int n2, int n3) {
        int result2 = n1 + n2 + n3;
        return result2;
    }

    public double add(double n1, double n2) {
        double result3 = n1 + n2;
        return result3;
    }
}

public class MethodOverloading_Example {
    public static void main(String[] args) {

        Calc obj = new Calc();
        int result1 = obj.add(4, 3);
        int result2 = obj.add(4, 5, 6);
        double result3 = obj.add(4.5, 3.4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
