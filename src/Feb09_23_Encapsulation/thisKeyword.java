package Feb09_23_Encapsulation;

class Student2 {
    private int age1;
    private String name1;

    public void setValue(int age1) {
        this.age1 = age1;
    }

    public void setValue1(String name1) {
        this.name1 = name1;
    }

    public void show() {
        System.out.println(name1 + " " + age1);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Student2 obj = new Student2();

        obj.setValue(37);
        obj.setValue1("Secundrabad");
        obj.show();

        Student2 obj1 = new Student2();

        obj1.setValue(27);
        obj1.setValue1("Hyderabad");
        obj1.show();

    }
}
