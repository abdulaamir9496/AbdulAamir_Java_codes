package March_20_23_CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

//HashSet class and LinkedHashSet class implements Set interface
public class HashSet_class_And_LinkedHashSet_class {
    public static void main(String[] args) {
        //Sorted and insertion order is not allowed. It follows the Hashing which has Hash table.
        // Hashtable has buckets which store only unique values. Duplicates are not allowed. Searching is very fast.
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(75);
        hs.add(50);
        hs.add(25);

        System.out.println(hs);
        //loadfactor 0.75%, if 75% of space is filled, it will double it's space from default 16 elements space to 32 elements space and so on.

        //Duplicates and Null values are not allowed
        hs.add(50);
        hs.add(25);
        System.out.println(hs);

        //LinkedHashSet: insertion order is allowed
        LinkedHashSet lh = new LinkedHashSet();
        lh.add(100);
        lh.add(75);
        lh.add(50);
        lh.add(25);

        System.out.println(lh);

        //Duplicates and Null values are not allowed
        lh.add(50);
        lh.add(25);
        System.out.println(lh);
    }
}

//Majorly as a developer we use more ArrayList and LinkedList.
// If specific requirements, then only we use other class in a collection.