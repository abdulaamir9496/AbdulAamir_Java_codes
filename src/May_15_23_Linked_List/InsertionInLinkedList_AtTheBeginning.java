package May_15_23_Linked_List;
class InsertionInLinkedList_AtTheBeginning {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    //implementation of insertion of a node at the end
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);
        
        //linkedlist is empty
        if(head == null)
        {
            head = new Node(newData);
            return;
        }
        
        //linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    
    //implementation of insertion of a node at the beginning
    public void insertAtBeginning(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    
    //implementation of displaying the linkedlist
    public void displayLLE()
    {
        Node current = head;
        while (current != head)
        {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    // implementation of displaying the linkedlist
    public void displayLLB(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        InsertionInLinkedList_AtTheBeginning llist = new InsertionInLinkedList_AtTheBeginning();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);

        System.out.println("Before insertion of 1 and 19");
        llist.displayLLE();
        System.out.println();

        llist.insertAtBeginning(1);
        llist.insertAtBeginning(19);

        System.out.println("After insertion of 1 and 19");
        llist.displayLLB();
        System.out.println();
    }
}
