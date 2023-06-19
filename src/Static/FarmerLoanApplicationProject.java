package Static;

import java.util.Scanner;

class Farmer {
    int principalAmount;
    float timeDuration;
    float rateOfInterest;
    float simpleInterest;

    void input() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please mention the amount required: ");
        principalAmount = scn.nextInt();
        System.out.println("Please mention the time duration: ");
        timeDuration = scn.nextFloat();
        System.out.println();
        rateOfInterest = 8.5f;
    }

    void compute() {
        simpleInterest = (principalAmount * timeDuration * rateOfInterest) / 100f;
    }

    void display() {
        System.out.println("SimpleInterest is : " + simpleInterest);
    }
}

public class FarmerLoanApplicationProject {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.display();

        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.display();
    }
}
