package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //1. write string
        //2. remove space
        //3. tolowecase
        //4. toCharArray
        //5. sort
        //6. compare

        //Case1: Anagram with UpperCase or UpperCase & LowerCase letters + with spaces
        /*String str1 = "The ClassRoom";
        String str2 = "School Master";

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] ar1 = str1.toCharArray();
        char[] ar2 = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if (Arrays.equals(ar1, ar2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }*/

        //Case1: Anagram with LowerCase letters + without spaces
        //1. write string
        //4. toCharArray
        //5. sort
        //6. compare
        String str1 = "peek";
        String str2 = "keep";

        char[] ar1 = str1.toCharArray();
        char[] ar2 = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if (Arrays.equals(ar1, ar2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
