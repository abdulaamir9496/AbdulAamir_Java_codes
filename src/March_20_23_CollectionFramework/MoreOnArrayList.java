package March_20_23_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

//More on ArrayList: How to use inbuilt classes and basics of ArrayList
public class MoreOnArrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add("Coder");
        al1.add("Programmer");

        System.out.println(al1);
        System.out.println("**************************************");

        //contains (returns true or false)
        System.out.println(al1.contains(200));

        //indexof
        /*int index = al1.indexOf(300);
        System.out.println(index);*/
        System.out.println(al1.indexOf(200));

        //ensureCapacity
        al1.ensureCapacity(7);
        System.out.println(al1);

        //TrimToSize
        al1.trimToSize();
        System.out.println(al1);

        //size
        System.out.println(al1.size());

        //clear
        al1.clear();
        System.out.println(al1);

        //Child type 'object' with Child type 'reference'
        ArrayList al2 = new ArrayList();

        //Child type 'object' with Parent type 'reference'
        List al3 = new ArrayList();


    }
}
