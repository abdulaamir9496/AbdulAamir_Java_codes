package Strings;

public class Reversing_String_In_Java {
    public static void main(String args[]) {

        //Case1: Reversing a String
        /*String str = "ManPower";
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println("Before Reversing: " + str);
        System.out.println("After Reversing: " + str1);*/

        //Case2: reversing the array of string words
        /*String str = "Welcome Programmer";
        String str1 = "";
        String[] sarr = str.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            str1 += sarr[i] + " ";
        }
        System.out.println("Before Reversing: " + str);
        System.out.println("After Reversing: " + str1);*/

        //Case3: Reversing String with along with space in between
        /*String str = "Moon Walk";
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("Before Reversing: " + str);
        System.out.println("After Reversing: " + str1);*/

        //Case4: Reversing String on their own word's place
        String str = "Burning Sun";
        String str1 = "";
        String arr[] = str.split(" ");
        for (String elem : arr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                str1 += elem.charAt(i);
            }
            str1 += " ";
        }
        System.out.println("Before Reversing: " + str);
        System.out.println("After Reversing: " + str1);
    }
}
