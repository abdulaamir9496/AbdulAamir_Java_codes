package March_27_23_Map_and_Generics;

import java.util.Hashtable;
import java.util.TreeMap;

//In-built classes in Map Hierarchy. HashTable and TreeMap classes
public class HashTable_TreeMap_Classes {
    public static void main(String[] args) {
        /*
        1. HashTable: Order of insertion is not maintained, dynamically grows, No sorting in ascending
        0.75% after that doubles the bucket space
        Duplicates allowed only if 'key object' is unique
        Synchronized
        No null key and No null values allowed
        Other in-built methods works as usual, as it works in other classes
        For getting keys, values, and both together
         */
        Hashtable ht = new Hashtable();
        ht.put(1, "Canada");
        //ht.put(2, "Hongkong");
        ht.put(3, "Tokyo");
        ht.put(4, "Turkey");
        //ht.put(null, null);     //NullPointerException
        ht.putIfAbsent(2, "Seoul");      //If the value is not present, it will add up in that key given key place

        System.out.println(ht);

        /*
        2. TreeMap: Order of insertion is not maintained, dynamically grows,
        It will sort in ascending order
        As a Tree set worked in a collection framework in the same way TreeMap will work in Map Hierarchy
        As other in-built methods work in HashMap in the same way it works here as well.
        Giving reference in place of 'key' for the created object is allowed in the TreeMap.
         */
        TreeMap tm = new TreeMap();
        tm.put(11, "Rocket");
        tm.put(12, "Aeroplane");
        tm.put(13, "Jet");
        tm.put(14, "Helicopter");

        Integer i = new Integer(15);      //'Integer(int)' is deprecated and marked for removal
        tm.put(i, "Helicopter");

        System.out.println(tm);
    }
}
