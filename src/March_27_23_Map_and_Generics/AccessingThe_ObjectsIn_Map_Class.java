package March_27_23_Map_and_Generics;

import java.security.KeyStore;
import java.util.*;

//Accessing the objects in Map class
public class AccessingThe_ObjectsIn_Map_Class {
    public static void main(String[] args) {
        Map map = new HashMap();     //object created with parent class reference
        map.put(1, "Welcome");       //Entry
        map.put(2, "to");
        map.put(3, "Onboarding");
        map.put(4, "Session");

        System.out.println(map);

        //How to get the entry's value
        System.out.println(map.get(3));

        //How to get the keys from entry
        Set keySet = map.keySet();      //return keys
        Iterator itr = keySet.iterator();
        while (itr.hasNext()) {
            //System.out.println(itr.next());      //printing the keys from entry
            Integer key = (Integer) itr.next();      //We have downcast for storing the data
            System.out.println(key);       // as it returns in an object by default.
        }

        //How to get the values from the entry
        Collection values = map.values();
        Iterator itr1 = values.iterator();
        while (itr1.hasNext()) {
            //System.out.println(itr1.next());       //printing the keys from entry
            String names = (String) itr1.next();      //We have downcast for storing the data
            System.out.println(names);       // as it returns in an object by default.
        }

        //How to get both 'keys' and 'values' from entry
        Set entrySet = map.entrySet();
        Iterator itr2 = entrySet.iterator();
        while (itr2.hasNext())
        {
            Map.Entry data = (Map.Entry) itr2.next();
            System.out.println(data.getKey() + " : " + data.getValue());
            //System.out.println(itr2.next());      //printing the keys from entry
        }
    }
}
