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
        System.out.println("Top most element in the stack before deletion is: " + stack.peek());
        
        //Delete the top most element from the stack
        System.out.println("Deleted the top most element from the stack: " + stack.pop());

        System.out.println("Current top most element in the stack after deletion is: " + stack.peek());
        
        //Searching the element in the stack
        //Search function returns -1 when the element is not present in the stack
        System.out.println(stack.search("Element 1 is present at the position: " + stack.search(1)));
        
        //Check whether the stack is empty or not?
        //Empty function returns the boolean value(True/ False)
        System.out.println("Is stack empty or not: " + stack.isEmpty());
    }
}
