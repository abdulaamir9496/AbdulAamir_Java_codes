package May_12_23_LiveClass;

import java.util.Arrays;

public class Rat_In_A_Maze {
    public static boolean isSafe(int[][] maze, int x, int y, int n)
    {
        if(x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1)
        {
            return true;
        }
        return false;
    }
    public static boolean solveMaze(int[][] maze, int[][] solutionMatrix, int x, int y, int n)
    {
        //Base case condition
        if(x == n -1 && y == n-1 && maze[x][y] == 1)
        {
            solutionMatrix[x][y] = 1;
            return true;
        }
        if(isSafe(maze, x, y, n))
        {
            //do
            solutionMatrix[x][y] = 1;
            //recursive
            if(isSafe(maze, x + 1, y, n))
            {
                return true;
            }
            if(isSafe(maze, x, y + 1, n))
            {
                return true;
            }
            if(isSafe(maze, x - 1, y, n))
            {
                return true;
            }
            if(isSafe(maze, x, y -1, n))
            {
                return true;
            }
            //backtrack
            solutionMatrix[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = new int[][]{
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 0, 0},
                {1, 1, 1, 1},
        };
        int[][] solutionMatrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };
        int length = maze.length;
        if(solveMaze(maze, solutionMatrix, 0, 0, length))
        {
            System.out.println(Arrays.deepToString(solutionMatrix));
        }
        else
        {
            System.out.println("Solution does not exist.");
        }
    }
}
