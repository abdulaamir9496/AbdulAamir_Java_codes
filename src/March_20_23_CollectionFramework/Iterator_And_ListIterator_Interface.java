package March_20_23_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Iterator and ListIterator interface traverse elements in both forward and backward direction
public class Iterator_And_ListIterator_Interface {
    public static void main(String[] args) {
//After storing the data, how to fetch will see in this Iterator

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(50);
        al.add(20);

        System.out.println(al);

        //How to fetch data via traversing the elements and print
        //As an obj the data is stored
        //Using for loop storing data in an object
        /*for (int i = 0; i < al.size(); i++) {
            Object o = al.get(i);
            System.out.println(o);
        }

        //Without storing, just need to print the data
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        //Using for each loop and access the data
        for(Object o: al)
        {
            System.out.println(o);
        }*/

        //If we want to perform concurrent modification, we can't do with loops.
        // So, whenever the data is stored in loops. It is not recommended to fetch using loops in the collection.

        //Best way to fetch and access the data while traversing in throughout the collection framework we can use Iterator.
        //For performing any changes while traversing the data, we have to use Iterator.

        //Forward Iterator:
        Iterator itr = al.iterator();
        while (itr.hasNext())       //as long as
        {
            /*Integer i = (Integer) itr.next();
            System.out.println(i);*/
            System.out.println(itr.next());
        }

        //Backward Iterator:
        ListIterator litr = al.listIterator(al.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }
}

