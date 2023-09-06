package DSA_Interview_Q_and_A;

public class Delete_Node_In_A_LinkedList {
    int val;
    Delete_Node_In_A_LinkedList next;
    Delete_Node_In_A_LinkedList(int x) {val = x;}
    public static class Solution{
        public void deleteNode(Delete_Node_In_A_LinkedList node)
        {
            if(node == null || node.next == null)
            {
                return;
            }
            node.val = node.next.val;
            node.next = node.next.next;
        }
        public static void main(String[] args) {
            // Create a linked list and nodes for testing
            Delete_Node_In_A_LinkedList list = new Delete_Node_In_A_LinkedList(1);
            list.next = new Delete_Node_In_A_LinkedList(2);
            list.next.next = new Delete_Node_In_A_LinkedList(3);
            list.next.next.next = new Delete_Node_In_A_LinkedList(4);

            // Create an instance of the Solution class
            Delete_Node_In_A_LinkedList.Solution solution = new Solution();

            // Delete a node (for example, the second node)
            solution.deleteNode(list.next);
            
            //Print the updated linked list
            Delete_Node_In_A_LinkedList current = list;
            while (current != null)
            {
                System.out.println(current.val);
                current = current.next;
            }
        }
    }
}
