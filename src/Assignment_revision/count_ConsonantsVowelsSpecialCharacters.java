package Assignment_revision;

public class count_ConsonantsVowelsSpecialCharacters {
    public static void main(String[] args) {
        String str = "Abdulaamir9496@gmail.com";

        // Declare the variable vowels, consonant, digit and special characters
        int vowels = 0, consonants = 0, specialCharacters = 0, digits = 0;

        // str.length() function to count number of character in given string.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                str.toLowerCase();  //convert all alphabets into lowercase

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else
                    consonants++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else
                specialCharacters++;
        }
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("digits: " + digits);
        System.out.println("specialCharacters: " + specialCharacters);
    }
}
