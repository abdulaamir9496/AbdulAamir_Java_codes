package Fundamentals_Of_Java;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scan.nextInt();

        System.out.println("Your Age is " + age);

        System.out.println("Enter Average");
        double avg = scan.nextDouble();

        System.out.println("The average is " + avg);

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println("Your name is " + name);
    }
}
