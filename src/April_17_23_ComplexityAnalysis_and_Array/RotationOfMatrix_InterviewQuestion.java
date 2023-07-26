package April_17_23_ComplexityAnalysis_and_Array;

import java.util.Arrays;

//Rotation of Matrix (Interview Question)
public class RotationOfMatrix_InterviewQuestion {
    public static void rotateMatrix(int[][] arr)
    {
        //Step1: Transpose the 2D array
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Step2: Swap the left and right element
        for (int i = 0; i < m; i++) {
            int li = 0;
            int ri = n-1;

            while (li < ri)
            {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                };

        //function calling
        rotateMatrix(arr);

        for (var matrix : arr)
        {
            System.out.println(Arrays.toString(matrix));
        }
    }
}
