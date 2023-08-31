package May_15_23_Linked_List;

public class InsertionInLinkedList_AfterAnyNode {
    Node head;

    class Node {
        int data;
        Node next;

        //Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    //implementing insertion of a Nodes after anyNodes
    public void insertAfterAnyNode(Node prev_Node, int newData) {
        if (prev_Node == null) {
            System.out.println("The previous node cannot contain null values");
        }
        Node newNode = new Node(newData);
        newNode.next = prev_Node.next;
        prev_Node.next = newNode;
    }
    
    //Displays all the nodes after the insertion
    public void displayAfterInsertion() {
        Node current = head;
        while (current != null) {
            System.out.println(current + " ");
            current = current.next;
        }
    }
    
    //Calling the Nodes
    public static void main(String[] args) {
        InsertionInLinkedList_AfterAnyNode anyNode = new InsertionInLinkedList_AfterAnyNode();
        anyNode.head = anyNode.new Node(10);
        anyNode.head.next = anyNode.new Node(11);
        anyNode.head.next.next = anyNode.new Node(12);
        anyNode.head.next.next.next = anyNode.new Node(13);
        anyNode.head.next.next.next.next = anyNode.new Node(14);
        
        System.out.println("Linked List after successful insertion of all the nodes: ");
        anyNode.displayAfterInsertion();

        anyNode.insertAfterAnyNode(anyNode.head.next.next.next, 15);
        anyNode.displayAfterInsertion();
        System.out.println();
    }
}
