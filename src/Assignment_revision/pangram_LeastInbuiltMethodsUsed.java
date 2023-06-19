package Assignment_revision;

public class pangram_LeastInbuiltMethodsUsed {
    public static void main(String[] args) {

        boolean flag = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG".replace(" ", " ");
        char ch[] = str.toCharArray();

        int arr[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("It is not a PANGRAM");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("It is a PANGRAM");
        }
    }
}
