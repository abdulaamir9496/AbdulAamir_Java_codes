package May_22_23_HashMap_Stack_and_Queue;

import java.util.HashMap;
import java.util.Map;

public class Function_In_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        
        //Functionality of the put() function
        hashmap.put(1, "Muhammad");
        hashmap.put(2, "Abdul");
        hashmap.put(3, "Aamir");
        hashmap.put(4, "Shaikh");

        System.out.println("HashMap of the given data: " + hashmap);
        
        //Functionality of the get() function
        String result = hashmap.get(3);
        System.out.println(result);
        
        //Functionality of the containsKey() function
        System.out.println(hashmap.containsKey(1));
        
        //Functionality of the remove() function
        hashmap.remove(4);
        System.out.println("Updated hashMap: " + hashmap);
        
        //Functionality of the entrySet() function
        //Iterating using for loop
        for(Map.Entry<Integer, String> e : hashmap.entrySet())
        {
            System.out.println("HashMap is : ");
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
