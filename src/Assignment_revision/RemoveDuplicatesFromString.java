package Assignment_revision;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Balloon";
        String str2 = " ";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (str2.indexOf(arr[i]) < 0) {
                str2 += arr[i];
            }
        }
        System.out.println(str2);
    }
}
