package May_15_23_Linked_List;

public class Reverse_A_LinkedList_Recursively {
    Node head;   //Taking a Node as Head

    class Node   //Creating a Node class
    {
        int data;
        Node next;

        Node(int d)   //Creating a Node constructor
        {
            data = d;
            next = null;
        }
    }

    //Implementation of a reversed Linked List Recursively
    public void reversalRecursively(Node curr, Node prev) {
        //last node of a Linked List
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextptr = curr.next;
        curr.next = prev;
        //Recursive function calling
        reversalRecursively(nextptr, curr);
    }

    //Implementation of displaying the Linked List
    public void displaying_RLLR() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Reverse_A_LinkedList_Recursively reverseLinkedListRecursively = new Reverse_A_LinkedList_Recursively();
        reverseLinkedListRecursively.head = reverseLinkedListRecursively.new Node(100);
        reverseLinkedListRecursively.head.next = reverseLinkedListRecursively.new Node(101);
        reverseLinkedListRecursively.head.next.next = reverseLinkedListRecursively.new Node(102);
        reverseLinkedListRecursively.head.next.next.next = reverseLinkedListRecursively.new Node(103);
        reverseLinkedListRecursively.head.next.next.next.next = reverseLinkedListRecursively.new Node(104);

        reverseLinkedListRecursively.displaying_RLLR();
        System.out.println();

        reverseLinkedListRecursively.reversalRecursively(reverseLinkedListRecursively.head, null);
        System.out.println("Reversal of a Linked List Recursively is: ");
        reverseLinkedListRecursively.displaying_RLLR();
        System.out.println();
    }
}
