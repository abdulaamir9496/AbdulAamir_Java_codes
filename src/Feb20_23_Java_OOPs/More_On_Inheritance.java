package Feb20_23_Java_OOPs;

import javax.xml.namespace.QName;

class Human1 {
    private String name;

    Human1()
    {
        System.out.println("Human class constructor: ");
    }
    int age;
    void sleep() {
        age = 22;
        System.out.println("For HUMAN BEING you should be first BEING HUMAN");
        System.out.println(age);
    }
}

class Student1 extends Human1 {
    /*public Student1()  //Even if we call or not here java compiler will consider the default empty
    Student1 constructor, and in that in 1st line automatically it will also call a super() method in it.
    Super method will invoke the same parent class constructor.
    {
        super();
    }*/
    void disp() {
        System.out.println("The age is: " + age);
        //System.out.println("Your name is: " + name);   //showing error
    }
}
public class More_On_Inheritance {
    public static void main(String[] args) {
        Student1 st = new Student1();
        st.sleep();
        st.disp();

    }
}
