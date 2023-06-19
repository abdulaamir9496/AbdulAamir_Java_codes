package Strings;

public class FInal_Vs_Immutability {
    public static void main(String[] args) {

        /*int a = 10;
        System.out.println(a);  //10*/

        /*int a = 10;
        a = 20;
        System.out.println(a);  //20*/

        //Basic FINAL variable value
       /*final int a = 10;
        a = 20; //Error : Cannot assign a value to final variable 'a'
        System.out.println(a);  //20*/

        //Final Vs Immutability
        //Immutability Examples below
        /*StringBuffer sb = new StringBuffer("Welcome");
        //System.out.println(sb);

        sb.append(" Hi");
        //System.out.println(sb);

        sb = new StringBuffer("bye");
        System.out.println(sb);*/

        //Final keyword Example
         /*final*/ StringBuffer sb = new StringBuffer("Programmer");
        //System.out.println(sb);

        sb.append(" Coder");
        //System.out.println(sb);

        sb = new StringBuffer("Hacker");
        System.out.println(sb);
    }
}
