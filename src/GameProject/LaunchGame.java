package GameProject;

import java.util.*;

//1st step
class Guesser {
    int guessNum;  //variable (what it has, he can guess)

    /*written type*/
    public int guessNumber()  //Method Name is GuessingNum, This a parameter
    // (what it does: Activity of Guesser, Guessing the number)
    {
        Scanner sc = new Scanner(System.in);  //body Taking input
        System.out.println("Guesser! Kindly guess the Number");  //About to guess the number!
        guessNum = sc.nextInt(); //Storing the number after guess in guessNum(brain of guesser)
        return guessNum;  //Storing in the variable which we already created, returning via return variable.
        // Whenever EMPIRE calls it is returning the stored number from guessNum(Brain)
    }
}

class player {
    int pguessNum; //Variable

    public int guessNumber()  //Activity of a PLAYER (Method of player)
    {
        Scanner scn = new Scanner(System.in);  //scanner object
        System.out.println("Player! Kindly guess the Number");
        pguessNum = scn.nextInt();
        return pguessNum;
    }
}

class empire {
    int numFromGuesser;  //Variable for guesser
    int numFromPlayer1;  //Variable for Player1
    int numFromPlayer2;  //Variable for Player2
    int numFromPlayer3;  //Variable for Player3

    //Creating method (Activity of empire)
    public void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }

    public void collectNumFromPlayers() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numFromPlayer1 = p1.pguessNum;
        numFromPlayer2 = p2.pguessNum;
        numFromPlayer3 = p3.pguessNum;
    }

    void Compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Game tied! all players guessed correctly ");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player1 and Player2 WON the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player1 and Player3 WON the game");
            } else {
                System.out.println("Player1 WON the game");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player2 and Player3 WON the game");
            } else {
                System.out.println("Player2 WON the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player3 WON the game");
        } else {
            System.out.println("Game lost! Try again");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        empire u = new empire();
        u.collectNumFromGuesser();
        u.collectNumFromGuesser();
        u.Compare();
    }
}
