package Feb16_23_RevisionClass;

import java.util.Scanner;

public class Arrays_2D_Revision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter number of classes: ");
        int classes = scn.nextInt();

        System.out.println("Please enter the number of students in each class: ");
        int stuCount = scn.nextInt();

        int[][] arr = new int[classes][stuCount];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Please enter the marks of class:" + i + "Student:" + j);
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.print("The marks of a student are as below: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
