package Feb10_23_Constructor;

class Demo {
    private int a;
    private int b;

    public Demo() {
        System.out.println("Zero parametrized constructor by programmer");
        //DefaultConstructor will be created by the "compiler" during run time behind the scene automatically.
    }

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class MoreOnConstructor {
    public static void main(String[] args) {

        Demo d = new Demo();  //Empty constructor
        d.disp();
        //d.add();   //Error: not present

        Demo d2 = new Demo(10, 20);
        d2.disp();
    }
}

