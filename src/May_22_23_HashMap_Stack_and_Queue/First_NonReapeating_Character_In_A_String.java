package May_22_23_HashMap_Stack_and_Queue;
import java.util.HashMap;
import java.util.Scanner;
public class First_NonReapeating_Character_In_A_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();

        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else
            {
                map.put(str.charAt(i), 1);
            }
        }
        int result = -1;
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1)
            {
                System.out.println("The first Non-repeating " + i);
                result = 1;
                break;
            }
        }
        if(result == -1)
        {
            System.out.println("The Non-Repetitive character present in the String: " + result);
        }
    }
}
