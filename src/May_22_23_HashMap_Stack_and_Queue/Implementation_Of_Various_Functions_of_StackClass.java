package May_22_23_HashMap_Stack_and_Queue;

import java.util.Stack;

public class Implementation_Of_Various_Functions_of_StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        //Push the elements in the stack
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(9);
        
        //Print the topmost element from the stack
        System.out.println("Top most element in the stack: " + stack.peek());
        
        //Delete the top most element from the stack
        System.out.println("Deleted the top most element from the stack: " + stack.pop());

        System.out.println("Current top most element in the stack is: " + stack.peek());
    }
}
