package Strings;

public class Mutable_String {
    public static void main(String[] args) {
        //TOPIC1: StringBuffer for creating MUTABLE Strings
        /*StringBuffer sb = new StringBuffer("Aamir");
        System.out.println(sb);

        //StringBuffer sb1 = ""; Invalid

        sb.append(" Khan");
        System.out.println(sb);*/

        //TOPIC2: StringBuilder for creating MUTABLE Strings
        StringBuilder sb = new StringBuilder("Programmer");
        System.out.println(sb);

        sb.append(" Coder");
        System.out.println(sb);
    }
}
