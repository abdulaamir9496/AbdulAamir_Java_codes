package Strings;

public class Rough {
    public static void main(String[] args) {
        //Reverse a string without space and with space as both have same formulae
        //Reverse a string on their same places
        //Reverse a string words

        /*String str = "Burning Sun";
        String str1 = "";

        String arr[] = str.split(" ");
        for(String element: arr){
            for (int i = element.length() - 1; i >= 0; i--) {
                str1 += element.charAt(i);
            }
            str1 += " ";
        }
        System.out.println(str1);*/

        //Print Palindrome
        /*String str = "25152";
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }*/

        //Anagram
        /*String str = "kEeP".toLowerCase().replace(" ", " ");
        String str1 = "peEK".toLowerCase().replace(" ", " ");
        char ch[] = str.toCharArray();
        char ch1[] = str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if (Arrays.equals(ch1, ch)) {
            System.out.println("This is ANAGRAM");
        } else {
            System.out.println("This is not ANAGRAM");
        }*/

        //PANGRAM
        boolean checking = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str = str.replace(" ", "");
        char[] ch = str.toCharArray();
        int arr[] = new int[26];

        for (int i = 0; i < ch.length; i++) {  //Traversing in character array from 0 till length
            arr[ch[i] - 65]++;  //ASCII (alphabet number - 65) ++;
        }
        for (int i = 0; i < arr.length; i++) {  //Traversing in interger empty array from 0 till length(26)
            if (arr[i] == 0) {
                System.out.println("It is not a PANGRAM");
                checking = true;
            }
        }
        if (checking == false) {
            System.out.println("It is a PANGRAM");
        }
    }
}

