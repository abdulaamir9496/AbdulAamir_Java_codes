package Fundamentals_Of_Java_Arrays_OOPs;

public class Create_Object {
    int a = 10;
    String name = "Muhammad";
    public static void main(String[] args) {
        int num = 12;
        Create_Object obj = new Create_Object();
        Create_Object obj1 = new Create_Object();

        obj1.name = "Aamir";
        obj.a = 5;
        System.out.println(obj.name);
        System.out.println(obj1.name);
        System.out.println(num);
        System.out.println(obj1.a);
        System.out.println(obj.a);
    }
}
