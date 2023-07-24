package April_17_23_ComplexityAnalysis_and_Array;
/*
Finding Duplicate elements in an array
Time Complexity:
Space Complexity:
 */
public class Finding_Duplicate_Elements {
    public static void main(String[] args) {
        int array[] = {1, 3, 4, 6, 7, 8, 9, 7, 9};
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.println("The Duplicate element of an Array is: " + array[j]);
                }
            }
        }
    }
}
