/*
package May_15_23_Linked_List;

public class Deletion_In_LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //Implementing deletion of a node in a Linked List
    void deleteNode(int position) {
        //Linked List is empty
        if (head == null) {
            return;
        }
        InsertionInLinkedList_AfterAnyNode.Node temp = head;
        //Deletion is in the beginning of the node
        if (position == 0) {
            head = temp.next;
            return;
        }
        //Deletion is not in the beginning for the node
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;  //increasing temp value
        }
        if (temp == null && temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }
}

*/
