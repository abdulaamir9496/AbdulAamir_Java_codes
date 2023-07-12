package March_20_23_CollectionFramework;

import java.util.LinkedList;

//More on LinkedList and its inbuilt default methods
public class MoreOnLinkedList {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);

        System.out.println(ll1);

        //get: Returns the element at the specified position in this list
        System.out.println(ll1.get(1));

        //indexof: the index of the first occurrence of the specified element in this list,
        // or -1 if this list does not contain the element
        System.out.println(ll1.indexOf(300));

        //lastindexof: the index of the last occurrence of the specified element in this list,
        // or -1 if this list does not contain the element
        System.out.println(ll1.lastIndexOf(300));

        //getFirst: Returns the first element in this list.
        System.out.println(ll1.getFirst());

        //getLast: Returns the last element in this list.
        System.out.println(ll1.getLast());

        //Push: Pushes an element onto the stack represented by this list.
        // In other words, insert the element at the front of this list.
        //This method is equivalent to addFirst.
        ll1.push(1);
        System.out.println(ll1);

        //peek: Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(ll1.peek());
        System.out.println(ll1.peekFirst());
        System.out.println(ll1.peekLast());

        //poll: Retrieves and removes the head (first element) of this list.
        System.out.println(ll1.poll());
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

        //pop: This method is equivalent to removeFirst().
        System.out.println(ll1.pop());
        System.out.println(ll1);

        //remove: Retrieves and removes the head (first element) of this list.
        System.out.println(ll1.remove());
        System.out.println(ll1);

        //Added elements again for checking others inbuilt methods.
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);

        //removeFirst: Removes and returns the first element from this list.
        System.out.println(ll1.removeFirst());
        System.out.println(ll1);

        //removeLast: Removes and returns the last element from this list.
        System.out.println(ll1.removeLast());
        System.out.println(ll1);

        //In the same way, we have many more inbuilt default methods in collections of LinkedList,
        //Which makes developers' life easy.
        //We can use these inbuilt methods as per requirement and need.
    }
}
