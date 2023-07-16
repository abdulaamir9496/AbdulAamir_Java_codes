package March_27_23_Map_and_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.BinaryOperator;

//Collections class and it's inbuilt methods
public class Collections_Class_Inbuilt_Methods {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(70);
        al.add(20);

        System.out.println(al);     //Before sorting the Integer values
        Collections.sort(al);
        System.out.println(al);      //After sorting the Integer values

        ArrayList al1 = new ArrayList();
        al1.add("Bachelors");
        al1.add("Of");
        al1.add("Business");
        al1.add("Management");
        al1.add("Degree");

        System.out.println(al1);      //Before sorting the String values

        Collections.sort(al1);
        System.out.println(al1);       //After sorting the String values

        ArrayList al2 = new ArrayList();      //For Binary, search data should be in sorted order
        al2.add(100);
        al2.add(200);
        al2.add(300);
        al2.add(400);
        al2.add(500);

        System.out.println(al2);        //If data is not in sorted order, we cannot perform binary search
        int index = Collections.binarySearch(al2, 200);
        System.out.println(index);     //If data is not sorted, it returns negative values

        //Rotating the values
        Collections.rotate(al2, 3);
        System.out.println(al2);

        //shuffle the values
        Collections.shuffle(al2);
        System.out.println(al2);

        //frequency: how many times the values have returned
        System.out.println(Collections.frequency(al2,200));

    }
}
