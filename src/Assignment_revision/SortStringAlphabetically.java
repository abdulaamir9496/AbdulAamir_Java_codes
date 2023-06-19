package Assignment_revision;
import java.util.Arrays;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String str = "Raining in the forest 56@)";

        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        str = new String(ch);

        System.out.println("Before sorting alphabetically: " + str);
    }
}
