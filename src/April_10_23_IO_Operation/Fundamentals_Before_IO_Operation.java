package April_10_23_IO_Operation;
//Fundamentals before IO operation

class Student
{
    private String name;
    private int age;
    private String city;
    Student(String name, int age, String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    //If we want to get output instead of address/ Hashcode, we have to override toString method


    @Override
    public String toString() {
        return "Name : " + name + "| Age : " + age + "| City : " + city;
    }
}
public class Fundamentals_Before_IO_Operation {
    public static void main(String[] args) {
        Student std = new Student("Aamir", 27, "Hyderabad");
        Student std1 = new Student("Muhammad", 28, "Delhi");

        System.out.println(std1);     //In o/p we get Hashcode/ addresses instead of o/p
        System.out.println(std);      //In o/p we get Hashcode/ addresses instead of o/p
    }
}
