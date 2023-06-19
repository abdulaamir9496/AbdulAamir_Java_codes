package Assignment_revision;

public class Palindrome {
    public static void main(String[] args) {
        String str = "2552";
        String str1 = "";

        for (int i = str.length() - 1; i >= 0; i--) {  //reversing string loop
            str1 += str.charAt(i);   //Adding every character in str1
        }
        if (str.equals(str1)) {
            System.out.println("Given string is PALINDROME");
        } else {
            System.out.println("Given string is not PALINDROME");
        }
    }
}
