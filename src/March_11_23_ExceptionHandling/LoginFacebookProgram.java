package March_11_23_ExceptionHandling;

import java.util.Scanner;

//Why we use custom exception & it's benefits, what is the difference b/w throw and throws
class MyException extends Exception {

}

class Facebook {
    String S1 = "abdulaamir9496";
    int a = 7863;
    String S2;
    int b;

    public void input() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        S2 = scn.nextLine();
        System.out.println("Enter your Password: ");
        b = scn.nextInt();
    }

    public void validation() throws MyException {
        if ((S1.equalsIgnoreCase(S2)) && (a == b)) {
            System.out.println("Welcome to your Facebook Account");
        } else {
            //System.out.println("This is not your Facebook Account");
            MyException me = new MyException();     //Created custom exception
            throw me;
        }
    }
}

class FBCompany {
    public void checking() {
        Facebook fb = new Facebook();
        fb.input();
        try {
            fb.validation();
        } catch (MyException e) {     //Handling Exception: Don't handle in the main method as a good programmer
            System.out.println("Try again Username or Password is incorrect");
            fb.input();
            try {
                fb.validation();
            } catch (MyException f) {
                System.out.println("Try again Username or Password is incorrect");
                fb.input();
                try {
                    fb.validation();
                } catch (MyException g) {
                    System.out.println("This is not your Facebook Account");
                }
            }
        }
    }
}

public class LoginFacebookProgram {
    public static void main(String[] args) {
        FBCompany fbc = new FBCompany();
        fbc.checking();
    }
}
