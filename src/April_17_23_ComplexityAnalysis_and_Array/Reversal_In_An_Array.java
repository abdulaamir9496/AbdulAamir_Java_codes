package April_17_23_ComplexityAnalysis_and_Array;
/*
Reversal in an array
Time complexity: O(n)
Space complexity: O(1)
 */
public class Reversal_In_An_Array {
    public static void main(String[] args) {
        int [] array = {2, 4, 8, 10, 12, 14};
        int n = array.length;

        for (int i = 0; i < n/2; i++) {
            //Swap the elements in between array[i] and array[n-i-1]
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
