package March_27_23_Map_and_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 implements Comparable<Student2>     //we have to write method when we use implements
{
    int marks;
    int age;
    String names;
    public Student2(int marks, int age, String names)    //Constructor & setter
    {
        this.marks = marks;
        this.age = age;
        this.names = names;
    }
    public int getMarks() {      //Getter
        return marks;
    }
    public int getAge() {
        return age;
    }
    public String getNames() {
        return names;
    }
    public String toString()
    {
        return " " + marks + " - " + age + " - " + names;
    }
    @Override
    public int compareTo(Student2 st)      //method
    {
        if(this.age > st.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
/*class Alpha implements Comparator<Student2>
{
    public int compare(Student2 a, Student2 b)
    {
        if(a.marks > b.marks)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}*/
public class ComparatorVsComparable_Interface {
    public static void main(String[] args) {
        Student2 std = new Student2(80, 20, "Younus");
        Student2 std1 = new Student2(75, 18, "Yusuf");
        Student2 std2 = new Student2(89, 24, "Yaqub");

        //Alpha alpha = new Alpha();       //by creating obj

        /*Comparator<Student2> cm = (Student2 a, Student2 b) ->    //Anonymous innerclass with Lambda expression (Implementation stored in 'cm'
        {
            if(a.marks> b.marks)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        };*/

        /*ArrayList al = new ArrayList();
        al.add(50);
        al.add(30);
        al.add(40);
        al.add(10);
        al.add(20);

        System.out.println(al);     //Before sort
        Collections.sort(al);
        System.out.println(al);     //After sort*/

        List<Student2> lstd = new ArrayList<>();
        lstd.add(std);
        lstd.add(std1);
        lstd.add(std2);

        Collections.sort(lstd, (Student2 a, Student2 b) ->
        {      //Here we have given direct implementation (It is like industrial level coding)
            if(a.marks> b.marks)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        });      //sorting
        Collections.sort(lstd);
        System.out.println(lstd);      //calling

    }
}


//Whenever we have target class accessible/modifiable, In that we have to go with 'comparable'
/*
If some developer written any code and I have to sort that code.
I don't have access to class Student2, and I want the object to get modified/ sorted in that scenario I have to use 'comparator interface'
If I have access to class Student2, and I want the object to get modified/ sorted in that scenario I have to use 'comparable interface'
 When using 'comparable interface' I should have target class accessible
 This is all about 'comparator' and 'comparable.'*/