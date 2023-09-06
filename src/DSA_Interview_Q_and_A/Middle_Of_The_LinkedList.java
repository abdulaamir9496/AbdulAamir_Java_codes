package DSA_Interview_Q_and_A;

public class Middle_Of_The_LinkedList {
    int val;
    Middle_Of_The_LinkedList next;
    Middle_Of_The_LinkedList() {}
    Middle_Of_The_LinkedList(int val) { this.val = val; }
    Middle_Of_The_LinkedList(int val, Middle_Of_The_LinkedList next) { this.val = val; this.next = next; }
}
class Solution
{
    public Middle_Of_The_LinkedList middleNode(Middle_Of_The_LinkedList head)
    {
        //Approach using 2 Iterations
        /*int n = 0;
        Middle_Of_The_LinkedList temp = head;
        while (temp != null)   //First Iteration
        {
            n++;
            temp = temp.next;
        }
        int half = n / 2;
        temp = head;
        while (half--)   //Second Iteration
        {
            temp = temp.next;
        }
        return temp;*/

        //Approach using 1 Iterations
        Middle_Of_The_LinkedList slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}