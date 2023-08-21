package May_05_23_LiveClassRevision;

public class Alternate_Sum_Series_Recursion {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        //number of rows
        int m = matrix.length;
        if(m==0)
        {
            return false;
        }
        //number of columns
        int n = matrix[0].length;
        
        //binary search implementation
        int low = 0, high = m * n - 1;
        int midIdx, midElement, rowIdx, colIdx;
        
        while (low <= high)
        {
            midIdx = low + (high - low) / 2;
            rowIdx = midIdx / n;
            colIdx = midIdx % n;
            midElement = matrix [rowIdx][colIdx];
            
            if(target == midElement)
            {
                return true;
            }
            else
            {
                if(target > midElement)
                {
                    midIdx = high - 1;
                }
                else
                {
                    midIdx = low + 1;
                }
            }
        }
        return false;
    }
}
