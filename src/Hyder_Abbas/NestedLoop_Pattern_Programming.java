package Hyder_Abbas;

public class NestedLoop_Pattern_Programming {
    public static void main(String[] args) {

        //Example 1: Nested Loop Pattern Programming
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        //Example 2: Nested Loop Pattern Programming
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Example 3: Print Hallow SQUARE Pattern {Using Logical OR (||) Operator}
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == 4 || j == 4){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 4: Print Hallow SQUARE Pattern {Using Logical OR (||) Operator} & using (n-1) method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'A' Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 6: Print 'H' Pattern using Logical OR(||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 7: Print 'I' Pattern using Logical OR(||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n-1)/2 || i == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 7: Print 'E' Pattern using Logical OR(||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j== 0 || i == (n-1)/2 || i == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 7: Print 'F' Pattern using Logical OR(||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 ||  i == (n-1)/2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'A' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 || i == (n-1)/2 && j <= (n-1)/2 || j == (n-1)/2 && i > 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'D' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 0 && j < (n-1)/2 || j == 0 || i == n-1 && j < (n-1)/2 || j == (n-1)/2 && i > 0 && i < n-1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'Double-D' within half Patterns using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == 0 && j < (n-1)/2 || i == n -1 && j < (n-1)/2 || j == (n-1)/2 && i > 0 && i < n -1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == 0 && j < (n-1)/2 || i == n -1 && j < (n-1)/2 || j == (n-1)/2 && i > 0 && i < n -1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'I' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 && j <= (n-1)/2 || j == 1 || i == n-1 && j <= (n-1)/2){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'L' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == n-1 && j <= (n-1)/2){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'E' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j <= (n - 1) / 2 || j == 0 || i == (n - 1) / 2 && j <= (n - 1) / 2 || i == n - 1 && j <= (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'F' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j <= (n - 1) / 2 || i == (n - 1) / 2 && j <= (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'H' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n-1)/2 && j <= (n-1)/2 || j == (n-1)/2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Example 5: Print 'T' within half Pattern using Logical OR (||) Operator & n-1 method
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j <= (n - 1) / 2 || j == 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/
    }
}
