package May_08_23_Backtracking_Interview_Problems;
public class PrintAllPermutations {
    //Swapping method
    public static String swap(String str, int i, int j)
    {
        //String into charArray for easy swapping
        char[] charArray = str.toCharArray();
        //swapping
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        
        //returning charArray values
        return String.valueOf(charArray);
    }
    //Permute method
    public static void permute(String str, int left, int right)
    {
        if(left == right)
        {
            System.out.println(str);
        }
        else 
        {
            for(int i = left; i <= right; i++)
            {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                
                //BackTracking
                str = swap(str, left, i);
            }
        }
    }
    public static void main(String[] args) {
        String str1 = "XY";
        int n1 = str1.length();
        System.out.println("For the string: " + str1 + "permutations are: ");
        permute(str1, 0, n1 - 1);
        
        String str2 = "ABC";
        int n2 = str2.length();
        System.out.println("For the string: " + str2 + "permutations are: ");
        permute(str2, 0, n2 - 1);
    }
}
