package April_17_23_ComplexityAnalysis_and_Array;
/*Remove missing number in an Array
Time complexity: O(n)
Space complexity: O(1)
 */
public class Missing_Number_In_An_Array {
    public static void main(String[] args) {
        int array[] = {1, 2, 4, 7, 6, 5};
        int n = array.length;

//Sum of natural numbers in an array
        int sumOfNaturalNumbers = ((n+1)*(n+2)/2);
        int sum = 0;

//Sum of current elements present in an array
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        int missingElement = 0;
        missingElement = sumOfNaturalNumbers - sum;
        System.out.println("Missing element in an Array is: " + missingElement);
    }
}
