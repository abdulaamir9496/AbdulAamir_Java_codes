package March_20_23_CollectionFramework;

import java.util.LinkedList;

//LinkedList class follows doubly LinkedList, data stores in the form of nodes in backend
public class LinkedList_Class {
    public static void main(String[] args) {

        //Stores 'Homogeneous type of data in a LinkedList 'collection'
        //Allowing duplicates elements
        //Order of insertion is processed in the rear(last) index in a continued manner.
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(30);

        System.out.println(ll1);

        //Storing 'Heterogeneous type of data in an ArrayList 'collection'
        //Order of insertion is processed in the rear(last) index in a continued manner.
        LinkedList ll2 = new LinkedList();
        ll2.add("PWSkills");
        ll2.add('A');
        ll2.add(1);
        ll2.add(1.00);

        System.out.println(ll2);

        //ArrayList maintains insertion order and is non-synchronized
        LinkedList ll3 = new LinkedList();
        ll3.add(70);
        ll3.add(80);
        ll3.add(90);

        System.out.println(ll3);

        //Adding data in a specific index (Index-based accessing is allowed.) But not preferable to use in ArrayList.
        // Index-based accessing should be used in LinkedList
        ll3.addFirst("Coding");
        ll3.addLast("Programming");

        System.out.println(ll3);

        //Having additional methods like: Getting a First element without removing from LinkedList class data
        System.out.println(ll3.peek());
        System.out.println(ll3);

        //Having additional methods like: Getting a First element by removing the first element from LinkedList class data
        System.out.println(ll3.poll());
        System.out.println(ll3);

    }
}
