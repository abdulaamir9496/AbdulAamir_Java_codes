package Feb09_23_Encapsulation;

class Student3 {
    int age3;
    String name3;

    //Used Setter and Getter method (ALT+ Insert)
    public int getAge3() {
        return age3;
    }
    public void setAge3(int age3) {
        this.age3 = age3;
    }
    public String getName3() {
        return name3;
    }
    public void setName3(String name3) {
        this.name3 = name3;
    }
    /*public void show() {
        System.out.println(name3 + " " + age3);
    }*/
}

public class Setters_Getters {
    public static void main(String[] args) {
        Student3 obj = new Student3();
        Student3 obj1 = new Student3();
        obj.setAge3(27);
        obj.setName3("Aamir");

        obj1.setAge3(80);
        obj1.setName3("Programmer");

        int stud1Age = obj.getAge3();
        String stud1Name = obj.getName3();

        int stud1Age1 = obj1.getAge3();
        String stud1Name1 = obj1.getName3();

        System.out.println(stud1Age);
        System.out.println(stud1Name);

        System.out.println(stud1Age1);
        System.out.println(stud1Name1);
    }
}
