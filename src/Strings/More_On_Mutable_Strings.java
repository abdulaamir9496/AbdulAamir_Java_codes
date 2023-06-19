package Strings;

public class More_On_Mutable_Strings {
    public static void main(String[] args) {

//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());

        /*StringBuilder sbld = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("asdffdsaasdffdsaa");
        System.out.println(sb.capacity());  //how much capacity it has
        System.out.println(sb.length());  //what is the length of this string values present*/

        /*StringBuffer sb2 = new StringBuffer("Aamir");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1, 'A');
        System.out.printf(String.valueOf(sb2));*/

   /* StringBuilder sb = new StringBuilder(150);
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb.capacity());*/

        StringBuilder sb = new StringBuilder("Reversed");
        System.out.println(sb);
        System.out.println(sb.reverse());

    }
}
