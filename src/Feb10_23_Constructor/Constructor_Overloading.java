package Feb10_23_Constructor;

class Student1 {
    private String name;   //This can be also called as fields / instance/ variables/ properties
    private int age;   //This can be also called as fields / instance/ variables/ properties

    //writing 3 constructor with same class name but different parameters is known as "Constructor Overloading".
    public Student1()     //default constructor
    {
        System.out.println("Default constructor is called");
        name = "Kingdom";
        age = 22;
    }

    public Student1(String name)    //Single parameterized constructor
    {
        this.name = name;
        age = 24;
    }

    public Student1(String name, int age)     //double parameterized constructor
    {
        this.name = name;
        this.age = age;
    }

    public void display()    //for output
    {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Student1 st1 = new Student1();     //object created with empty constructor
        st1.display();

        Student1 st2 = new Student1("Tigress");   //object created with single String type parameterized constructor
        st2.display();

        Student1 st3 = new Student1("Kung-fu Panda", 900);   ////object created with double(String name & Int age) parameterized constructor
        st3.display();
    }
}
