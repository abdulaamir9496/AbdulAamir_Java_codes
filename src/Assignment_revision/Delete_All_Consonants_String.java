package Assignment_revision;

public class Delete_All_Consonants_String {
    public static void main(String[] args) {
        String input = "Hello, have a good day";
        String result = removeConsonants(input);
        System.out.println(result);
    }

    public static String removeConsonants(String str) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is a vowel or whitespace
            if (vowels.indexOf(c) != -1 || Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}