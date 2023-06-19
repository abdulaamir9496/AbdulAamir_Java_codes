package Assignment_revision;

import java.util.Arrays;

public class AllUniqueCharacters {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "xyz";
//        String str = "xyyz";
        System.out.println("Original String : " + str);
        System.out.println("String has all unique characters: " + is_Unique_str(str));
    }

    /*package whatever //do not write package name here *//*


    class GfG {

        boolean UniqueCharacters(String str) {
            for (int i = 0; i < str.length(); i++)
                for (int j = i + 1; j < str.length(); j++)
                    if (str.charAt(i) == str.charAt(j))
                        return false;
            return true;
        }

        public static void main(String[] args) {
            */
    /*gFg obj = new gFg();*//*

            GfG obj = new GfG();
            String input = "GeeksforGeeks";

            if (obj.UniqueCharacters(input))
                System.out.println("This string " + input + "has all Unique Characters");
            else
                System.out.println("This string " + input + "has all duplicate Characters");
        }
    }
}
*/

    // Java program to illustrate string with
// unique characters using brute force technique
    /*public static void main(String args[]) {
        //GfG obj = new GfG();
        String str = "GeeksforGeeks";

        boolean flags = false;
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    flags = false;

        // If no duplicate characters encountered,
        // return true
        flags = true;

        if (   )
        {
            System.out.println("The String " + str + " has all unique characters");
        }
        else
        {
            System.out.println("The String " + str + " has duplicate characters");
        }
    }*/
    //Source: Cracking the Coding Interview Book
}
