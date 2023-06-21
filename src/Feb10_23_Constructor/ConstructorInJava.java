package Feb10_23_Constructor;

class Student {
    int age;
    String name;

    Student(String name, int age) {  //Constructor should be same name as a class name
        this.name = name;
        this.age = age;
    }

    //Instead of writing all this below stuff separately we do initialize while creating constructor at a time.
    /*public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }*/
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

public class ConstructorInJava {
    public static void main(String[] args) {
        Student st = new Student("Azlaan", 30);  //object creation with initialization, will use constructor

        //Student st1 = new Student();  //Error: will understand this in default constructor
        //st.disp();  //Error: we can't call something which is not in the class or constructor or method

        /*st.setAge(27);
        st.setName("Aamir");*/

        System.out.println(st.getAge());
        System.out.println(st.getName());
    }
}
