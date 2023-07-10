package March_13_23_MultiThreading;

import java.util.Scanner;

public class Thread_MultiThread {
    public static void main(String[] args) {
        System.out.println("Calculating task starting");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scn.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = scn.nextInt();

        System.out.println("Calculating task ended");
        System.out.println("****************************************************");

        System.out.println("Printing task starting");
        for (int i = 0; i < 4; i++) {
            System.out.println("*\t");
        }
        System.out.println("Printing task ended");
        System.out.println("****************************************************");

        System.out.println("Displaying important message task starting");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is very important while learning new things");
        }
        System.out.println("Displaying important message task ended");
        System.out.println("****************************************************");

    }
}

