package March_20_23_CollectionFramework;

import java.util.ArrayDeque;

//ArrayDeque class implements Deque interface. ArrayDeque is faster than ArrayList and Stack
public class ArrayDeque_Class {
    public static void main(String[] args) {
        //Stores 'Homogeneous type of data in a LinkedList 'collection'
        //Allowing duplicates elements
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        ad1.add(300);

        System.out.println(ad1);

        //add: Inserts the specified element at the end of this deque.
        //This method is equivalent to addLast.
        System.out.println(ad1.add(10));
        System.out.println(ad1);

        //addFirst: Inserts the specified element at the front of this deque.
        ad1.addFirst(1);
        System.out.println(ad1);

        //addLast: Inserts the specified element at the end of this deque.
        //This method is equivalent to add.
        ad1.addLast(2);
        System.out.println(ad1);

        //Storing 'Heterogeneous type of data in an ArrayList 'collection'
        ad1.add("ArrayDeque");
        ad1.add('D');
        ad1.add(10);
        ad1.add(1.00);

        System.out.println(ad1);

        //offer method: Inserts the specified element at the end of this deque.
        //This method is equivalent to offerLast.
        System.out.println(ad1.offer(1));
        System.out.println(ad1);

        //offerFirst:
        System.out.println(ad1.offerFirst("Added First"));
        System.out.println(ad1);

        //offerLast:
        System.out.println(ad1.offerLast("Added Last"));
        System.out.println(ad1);
    }
}
