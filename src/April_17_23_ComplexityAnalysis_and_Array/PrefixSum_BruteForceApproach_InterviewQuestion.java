package April_17_23_ComplexityAnalysis_and_Array;
import java.util.Scanner;
/*
Prefix Sum Brute Force Approach Interview Question
Time Complexity: O(m * n)
Space Complexity: O(1)
*/

public class PrefixSum_BruteForceApproach_InterviewQuestion {
    //prefixSumMatrix
    //Time Complexity: O(m * n)
    //Space Complexity: O(1)
    public static void prefixSumMatrix(int[][] arr){
        int m = arr.length;   //No.of rows
        int n = arr[0].length;   //No.of columns
        //traversed the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
        //traversed the column-wise to calculate the column-wise prefix sum
        //Final 2D array
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    //Time complexity: O(1)
    //Space complexity: O(1)
    public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2){
        int sum = 0, up = 0, left = 0, repeated_region = 0, result = 0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];
        result = sum - up - left + repeated_region;
        return result;
    }

    //Creating function
    public static int findSumMatrix(int[][] arr, int r1, int c1, int r2, int c2){
        int sum = 0;
        for (int i = r1; i<= r2; i++) {
            for (int j = c1; j<= c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Input number of rows
        System.out.println("Enter number of rows");
        int m = scn.nextInt();

        //Input number of columns
        System.out.println("Enter number of columns");
        int n = scn.nextInt();

        //Initializing 2D array
        int arr[][] = new int[m][n];

        //Entering the elements
        System.out.println("Enter the matrix elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        //Asking user to enter the values for required to be output
        int r1, c1, r2, c2;

        System.out.println("Enter the value of r1 coordinate: ");
        r1 = scn.nextInt();

        System.out.println("Enter the value of c1 coordinate: ");
        c1 = scn.nextInt();

        System.out.println("Enter the value of r2 coordinate: ");
        r2 = scn.nextInt();

        System.out.println("Enter the value of c2 coordinate: ");
        c2 = scn.nextInt();

        //Function calling: Not optimized code
        //int result = findSumMatrix(arr, r1, c1, r2, c2);

        //Function calling: optimized code
        prefixSumMatrix(arr);
        int result = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of elements of given rectangle is: " + result);
    }
}
