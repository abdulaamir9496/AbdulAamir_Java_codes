package March_27_23_Map_and_Generics;

import java.util.*;
/*class Gen     //we have created our own class
{

}*/

class Gen<T>      //T as a general type
{
    T obj;    //T as a Type, obj as a reference (T: T can be anything, Like: Int, String, any other data type)
    public Gen(T obj)     //Constructor
    {
        this.obj = obj;      //Setter
    }
    void disp()     //For display
    {
        System.out.println("Type of data is : " + obj.getClass().getName());
    }
    public T getObj()     //Getter
    {
        return obj;
    }
}

//More on Generics class
public class MoreOnGenerics_Class {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(10);     //Storing Integer type of data
        g.disp();
        System.out.println(g.obj);

        System.out.println("****************************************");
        Gen<String> g1 = new Gen<String>("Generics");      //Storing a String type of data
        g1.disp();
        System.out.println(g1.obj);

        /*Gen g = new Gen();    //own class's object is created

        ArrayList<String> al1 = new ArrayList<String>();     //child type reference to a child class object
        ArrayList<Integer> al2 = new ArrayList<Integer>();      //child type reference to a child class object
        List<String> l1 = new ArrayList<String>();     //parent type reference to a child class object
        Collection<Integer> l2 = new ArrayList<Integer>();     //parent type reference to a child class object

        //List<int> l3 = new ArrayList<int>();     //Type argument cannot be of a primitive type

        LinkedList<String> ll = new LinkedList<String>();
        List<String> ll2 = new LinkedList<String>();
        Collection<Integer> ll3 = new LinkedList<Integer>();
        //Collection<int> ll4 = new LinkedList<int>();     //parent type reference to a child class object

        //In the same way in other classes also we do and don't, as shown in for the above classes.
        //We can also create our own class and use that as a reference in collections' classes
        LinkedList<Gen> ll6 = new LinkedList<Gen>();   //Used reference of own created class
        Collection<Gen> cc = new LinkedList<Gen>();    //Used reference of own created class
        List<Gen> l = new ArrayList<Gen>();     //Used reference of own created class*/


    }
}
