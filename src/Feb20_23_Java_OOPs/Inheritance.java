package Feb20_23_Java_OOPs;

class Human {   //Super Class or Base Class or Parent Class
    int age = 18;
    void sleep() {
        System.out.println("You should sleep on time for good health");
        System.out.println(age);
    }
}
    class Student extends Human  //Child Class or Sub Class or Derived Class
    {

    }
public class Inheritance {   //Main Class
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();

    }
}
