package Assignment_revision;

public class Reverse_A_String {
    public static void main(String[] args) {

        String StringExampe = "Coder Programmer";
        System.out.println("Original String: " + StringExampe);

        StringBuffer sb = new StringBuffer(StringExampe);
        sb.reverse();
        System.out.println("Reversed String: " + sb);

        /*String stringExample  =  "PWSKILLS";
        System.out.println("Original string: "+stringExample);

        // Declaring a StringBuilder and converting string to StringBuilder
        StringBuilder reverseString = new StringBuilder(stringExample);
        reverseString.reverse();  // Reversing the StringBuilder

        // Converting StringBuilder to String
        String result = reverseString.toString();
        System.out.println("Reversed string: "+result); // Printing the reversed String*/

    }
}
