package Fundamentals_Of_Java;

public class Diagonal_Patterns {
    public static void main(String[] args) {

        //Pattern 1: Left Diagonal
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        //Pattern 2: Right Diagonal
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 3: 'X' Diagonal
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 4: ('X'- Diagonal) in Hallow SQUARE
        /*int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 5: P1 (Upper Half Up Left Diagonal)
        /*int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 5: P2 (Upper Half down Left Diagonal)
        /*int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i - j == (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 5: P3 (Upper Half Up Right Diagonal)
        /*int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j - i == (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 5: P4 (Upper Half down Right Diagonal)
        /*int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) + (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 6: Print (Right & Left Diagonal + Hallow SQUARE + TILTED SQUARE)
        /*int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2 || i + j == n - 1 + (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 ||
                        j == n - 1 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2 ||
                        j - i == (n - 1) / 2 || i + j == (n - 1) + (n - 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }*/

        //Pattern 6: Print (SQUARE + Tilted SQUARE + SQUARE & TILTED SQUARE both are filled + inside the square it should be hallowed)
  /*      int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                if(i + j == (n-1)/2 || i - j == (n-1)/2 || i + j == n-1 + (n-1)/2 || j - i == (n-1)/2){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1 || j == n-1 || i + j == (n-1)/2 || i - j == (n-1)/2 || i + j == n-1 + (n-1)/2 || j - i == (n-1)/2){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1 || j == n-1 || i + j <= (n-1)/2 || i - j >= (n-1)/2 || i + j >= n-1 + (n-1)/2 || j - i >= (n-1)/2){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }*/
    }
}
