package Assignment_revision;

public class Excercise {
    public static void main(String[] args) {
        //reversing a string normally
        String s = "OxfordUniversity";
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        System.out.println("Before normal reverse: " + s);
        System.out.println("After normal reverse: " + s1);

        //reversing the string with space in between
        String s2 = "Oxford University";
        String s3 = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            s3 += s2.charAt(i);
        }
        System.out.println("Before reversing with space: " + s2);
        System.out.println("After reversing with space: " + s3);

        //reversing the array of string words
        String s4 = "Oxford University";
        String s5 = "";
        String[] arr = s4.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            s5 += arr[i] + " ";
        }
        System.out.println("Before array of String words reverse: " + s4);
        System.out.println("After array of String words reverse: " + s5);

        //Reversing the Strings on their own word's place
        String s6 = "Building Tower";
        String s7 = "";
        String[] sarr = s6.split(" ");
        for (String elements : sarr) {
            for (int i = elements.length() - 1; i >= 0; i--) {
                s7 += elements.charAt(i);
            }
            s7 += " ";
        }
        System.out.println("Before reversing at same place: " + s6);
        System.out.println("After reversing at same place: " + s7);
    }
}
