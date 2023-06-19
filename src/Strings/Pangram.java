package Strings;

public class Pangram {
    public static void main(String[] args) {
        //1. It should have all the ALPHABETS from (a-z)
        //2. Remove spaces
        //3. Convert to either UpperCase or LowerCase
        //4. Convert to an CharArray
        //5. Create and Empty Array of total ALPHABETS from (a-z)

        /*boolean flag = false;
        String str = "The Quick Brown Fox Jumps Over Lazy Dog";
        str = str.replace(" ", "");
        str = str.toUpperCase();
        char[] ch = str.toCharArray();
        int arr[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Not Pangram");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Pangram");
        }*/

        //PANGRAM
        boolean flag = false;
        String str = "The Quick Brown Fox Jumps Over Lazy Dog";
        str = str.replace(" ", "");
        str = str.toUpperCase();
        char []ch = str.toCharArray();
        int arr[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Not Pangram");
                flag = true;
            }
            if (flag == false) {
                System.out.println("Pangram");
            }
        }
    }
}
