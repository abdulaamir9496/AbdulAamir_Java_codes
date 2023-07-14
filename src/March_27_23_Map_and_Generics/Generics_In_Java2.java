package March_27_23_Map_and_Generics;

import java.util.ArrayList;

//Generics in java 2
class Student1
{
    private String Name;
    private int id;
}
class Employees1
{
    private String Name;
    private int id;
}
public class Generics_In_Java2 {
    public static void main(String[] args) {
        Student1 std1 = new Student1();
        Student1 std2 = new Student1();

        Employees1 emp1 = new Employees1();

        //ArrayList al = new ArrayList();
        ArrayList<Student1> al = new ArrayList<Student1>();
        al.add(std1);
        al.add(std2);

        //al.add(emp1);     //Compile Time Error: when using 'Generics'
    }
}
