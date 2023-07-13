package March_27_23_Map_and_Generics;

import java.util.HashMap;
import java.util.LinkedHashMap;

//HashMap vs LinkedHashMap classes and it's inbuilt uses
public class HashMapVsLinkedHashMap_Classes {
    public static void main(String[] args) {
        HashMap hm = new HashMap();     //object class
        hm.put(01, "Muhammad");      //entry with (an object key, object value)
        hm.put(02, "Abdul");
        hm.put(03, "Aamir");
        hm.put(04, "Sheikh");      //Duplicate values are allowed
        hm.put(04, "Sheikh");     //Duplicate key objects are not allowed
        hm.put(null, null);      //Null as a key obj and value obj accepted
        hm.put(null, null);      //Only ONCE Null as a Key obj and value obj allowed
        hm.put("Name", "Aamir");     //Accepts both as Strings
        hm.put(100, 101);      //Accepts both as integers

        System.out.println(hm);
        //Insertion order is not allowed.

        //If we want to get insertion order, we have to use LinkedHashMap
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(10, "Coder");
        lhm.put(11, "Programmer");
        lhm.put(12, "Coding");
        lhm.put(13, "Programming");
        lhm.put(13, "Programming");     //Duplicates are not allowed
        lhm.put(14, "Programming");

        lhm.put(null, null);      //Null as a key obj and value obj are allowed
        lhm.put(null, null);      //Only ONCE Null as a Key obj and value obj allowed
        lhm.put("Name", "Aamir");     //Accepts both as Strings
        lhm.put(100, 101);      //Accepts both as integers

        System.out.println(lhm);
    }
}
