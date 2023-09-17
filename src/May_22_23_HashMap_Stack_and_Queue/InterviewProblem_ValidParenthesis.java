package May_22_23_HashMap_Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;
//Time Complexity: O(n)
public class InterviewProblem_ValidParenthesis {
    public static boolean isValid(String str)
    {
        char[] chars = str.toCharArray();
        
        Stack<Character> stack1 = new Stack<>();
        for(char ele: chars)
        {
            //If the elements contain the open brackets, push to the stack
            if(ele == '(' || ele == '[' || ele == '{')
            {
                stack1.push(ele);
                continue;
            }
            else if (stack1.isEmpty()) 
            {
                return false;
            }
            char top = stack1.pop();
            if(top == '(' && ele != ')')
            {
                return false;
            } else if (top == '[' && ele !=']') 
            {
                return false;
            } else if (top == '{' && ele !='}') 
            {
                return false;
            }
        }
        //Is the stack being empty or not?
        return(stack1.empty() == true);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scn.nextLine();

        System.out.println("Is the given string is a valid parenthesis: " + isValid(str));
    }
}
