package Assignment_revision;

import java.util.Arrays;

public class Anagram_LeastInbuiltMethodsUsed {
    public static void main(String[] args) {

        String str = "School Master".replace(" ", " ");
        String str1 = "The classroom".replace(" ", " ");  //megastores, manageress, greensomes.

        char arr1[] = str.toLowerCase().toCharArray();
        char arr2[] = str1.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Given string is ANAGRAM");
        } else {
            System.out.println("Given string is not a ANAGRAM");
        }
    }
}
