package Fundamentals_Of_Java;

public class Jan29_30_LoopsAndPatternProgramsAssignment7 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || j == 0 && i > 0 || i == (n - 1) / 2 && j <= (n - 1) / 2 || j == (n - 1) / 2 && i > 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2 || i == n - 1 && j < (n - 1) / 2 || j == (n - 1) / 2 && i > 0 && i < (n - 1) / 2 || j < (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            /*for (int j = 0; j < n; j++) {
                if () {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < n; j++) {
                if () {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < n; j++) {
                if () {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < n; j++) {
                if () {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < n; j++) {
                if () {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < n; j++) {
                if () {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }*/
            System.out.println();
        }
    }
}
