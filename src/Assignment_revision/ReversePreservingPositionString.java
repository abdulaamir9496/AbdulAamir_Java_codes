package Assignment_revision;

public class ReversePreservingPositionString {
    public static void main(String[] args) {

        String str = "Think Twice";
        String str1 = "";

        String[] sarr = str.split(" ");

        for (String elements : sarr) {
            for (int i = elements.length() - 1; i >= 0; i--) {
                str1 += elements.charAt(i);
            }
            str1 += " ";
        }
        System.out.println("Before reversing: " + str);
        System.out.println("After reversing: " + str1);
    }
}
