package March_27_23_Map_and_Generics;

import java.util.ArrayList;

//Generics in java, type-casting, storing, type safety, no type safety, type of data
public class Generics_InJava {
    public static void main(String[] args) {
        //TypeSafety
        /*String ar[] = new String[10];
        ar[0] = "Only";
        ar[1] = "Strings";
        ar[2] = "are allowed";
        //ar[3] = 1; //Compile Time Error: Integer is not allowed.

        System.out.println(ar[2]);
        String name1 = ar[0];     //Storing objects in String data type
        String name2 = ar[1];     //Storing objects in String data type
*/
        //No TypeSafety
       /* ArrayList al = new ArrayList(); //No TypeSafety
        al.add("String and Integers");
        al.add("are allowed");
        al.add(10);
        System.out.println(al);

        String n1 = (String)al.get(0);     //TypeCasting (Down-graded/ Down-casting)
        String n2 = (String)al.get(1);
        String n3 = (String)al.get(2);*/

        //TypeSafety can be achieved by using 'Generics'
        ArrayList<String> als = new ArrayList<String>();
        als.add("Only Strings");
        als.add("are allowed");
        als.add("Integers are not allowed");
        
        //als.add(50);      //Compile Time Error: After using Generics showing error for another type of data
        String str = als.get(0);
        String str1 = als.get(1);
        String str3 = als.get(2);
    }
}
