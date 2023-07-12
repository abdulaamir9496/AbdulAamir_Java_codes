package March_20_23_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        System.out.println(al);

        //Not recommended to use loops in any collections, framework for fetching and accessing the data
        /*for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
            al.add(100);
            //When we try to add the data while traversing the collection data.
            // As the loop is running for infinite times. That's why we don't recommend using loop
        }*/

        //Fail fast: Fails immediately if found any exception
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            //al.add(100);   //Here in 'Fail fast' we are getting 'ConcurrentModificationException'
        }

        //Fail safe
        CopyOnWriteArrayList cwa = new CopyOnWriteArrayList();
        cwa.add(10);
        cwa.add(20);
        cwa.add(30);
        cwa.add(40);
        cwa.add(50);

        System.out.println(cwa);
        Iterator itr1 = cwa.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            cwa.add(100); //Here we can fetch. But when we try to concurrent the modification by adding an element.
            // It doesn't get added, also we don't get error, and our output gets printed. This is known as 'Fail Safe.'
        }
    }
}

