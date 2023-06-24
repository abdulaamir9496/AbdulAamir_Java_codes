package Feb16_23_RevisionClass;

import java.util.Scanner;

public class Arrays_Revision {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the marks of a student: ");
            Scanner scn = new Scanner(System.in);
            arr[i] = scn.nextInt();
        }
        System.out.println("Below are the marks of a student");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
