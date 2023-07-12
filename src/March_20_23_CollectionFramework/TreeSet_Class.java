package March_20_23_CollectionFramework;

import java.util.TreeSet;

//TreeSet class implements Set interface that uses a tree for storage. Tree is fast. Elements stored in Ascending order.
public class TreeSet_Class {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);

        //Duplicated and Null values are not allowed
        ts.add(100);
        System.out.println(ts);

        //Higher: Returns the least element in this set strictly greater than the given element, or null if there is no such element.
        System.out.println(ts.higher(90));

        //Lower: Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        System.out.println(ts.lower(60));

        //ceiling: Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println(ts.ceiling(60));

        //floor: Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        System.out.println(ts.floor(40));
    }
}
