package May_08_23_Backtracking_Interview_Problems;

public class Enumeration_Tile_Problem_Amazon_Interview {
    public static int getWays(int n)
    {
        //Base case condition
        if(n <= 3)
        {
            return n;
        }
        //Recursive calls
        return getWays(n - 1) + getWays(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("For n = 1, total getWays are : " + getWays(1));
        System.out.println("For n = 2, total getWays are : " + getWays(2));
        System.out.println("For n = 3, total getWays are : " + getWays(3));
        System.out.println("For n = 4, total getWays are : " + getWays(4));
        System.out.println("For n = 5, total getWays are : " + getWays(5));
        System.out.println("For n = 6, total getWays are : " + getWays(6));
        System.out.println("For n = 7, total getWays are : " + getWays(7));
    }
}
