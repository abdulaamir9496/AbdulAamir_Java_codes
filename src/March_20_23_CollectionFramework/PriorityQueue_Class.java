package March_20_23_CollectionFramework;

import java.util.PriorityQueue;

//Priority Queue implements Queue interface
public class PriorityQueue_Class {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);

        System.out.println(pq);

        //Duplicates allowed in priority queue
        pq.add(25);
        System.out.println(pq);
    }
}

//apart from int other data types not allowed like: String
//Null values not allowed
