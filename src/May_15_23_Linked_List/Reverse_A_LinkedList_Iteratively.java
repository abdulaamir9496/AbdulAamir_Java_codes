package May_15_23_Linked_List;

public class Reverse_A_LinkedList_Iteratively {
    Node head;

    class Node   //Creating a class of a Head Node
    {
        int data;
        Node next;

        Node(int d)    //Creating a Constructor of a Head Node
        {
            data = d;
            next = null;
        }
    }

    //Implementation of Reverse a Linked List Iteratively
    public void reverseLinkedList() {
        Node curr = head;
        Node nextptr = null;
        Node prev = null;

        while (curr != null) {
            nextptr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextptr;
        }
        head = prev;
        return;
    }

    //Display all the nodes after the insertion
    public void displayRLL() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse_A_LinkedList_Iteratively rll = new Reverse_A_LinkedList_Iteratively();
        rll.head = rll.new Node(10);
        rll.head.next = rll.new Node(11);
        rll.head.next.next = rll.new Node(12);
        rll.head.next.next.next = rll.new Node(13);
        rll.head.next.next.next.next = rll.new Node(14);

        System.out.println("Original Linked List: ");
        rll.displayRLL();

        rll.reverseLinkedList();

        System.out.println("Reversed Linked List: ");
        rll.displayRLL();
    }
}
