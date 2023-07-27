package DSA_2D_Array_SumitMalik;

import java.util.Scanner;

public class WaveTraversal_2DArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = scn.nextInt();
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if(j % 2 == 0)
            {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }
            else
            {
                for (int i = arr.length-1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}