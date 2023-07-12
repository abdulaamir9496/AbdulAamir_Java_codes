package March_20_23_CollectionFramework;
//'ArrayList' using 'List Interface'

import java.util.ArrayList;

public class ArrayList_Class {
    public static void main(String[] args) {

        //Storing 'Homogeneous type of data in a ArrayList 'collection'
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);
        System.out.println("**************************************************************");

        //Storing 'Heterogeneous type of data in an ArrayList 'collection'
        ArrayList al2 = new ArrayList();
        al2.add("Coder>Programmer>Master");
        al2.add(10);
        al2.add('A');
        al2.add(10.2);

        System.out.println(al2);
        System.out.println("**************************************************************");

        //Order of insertion is processed in the rear(last) index in a continued manner.
        al2.add(50);
        al2.add(90);
        System.out.println(al2);
        System.out.println("**************************************************************");

        //ArrayList maintains insertion order and is non-synchronized
        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(4);

        System.out.println(al3);
        System.out.println("**************************************************************");

        //Calling ArrayList in another ArrayList
        /*al3.addAll(al2);*/
        al3.addAll(al2);
        System.out.println(al3);
        System.out.println("**************************************************************");

        //Allowing duplicates Arrays
        al3.add(95);
        al3.add(95);
        System.out.println(al3);
        System.out.println("**************************************************************");

        //Adding data in a specific index (Index-based accessing is allowed.) But not preferable to use in ArrayList.
        // Index-based accessing should be used in LinkedList
        al3.add(2, 5);
        al3.add(1, "specific index");
        System.out.println(al3);
        System.out.println("**************************************************************");


    }
}
