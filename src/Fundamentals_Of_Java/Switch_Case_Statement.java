package Fundamentals_Of_Java;

public class Switch_Case_Statement {
    public static void main(String[] args) {
        int num = 100;
        switch (num) {
            case 200:
                System.out.println("Case1");
                break;
            case 300:
                System.out.println("Case2");
                break;
            case 100:
                System.out.println("Case3");
                break;
            default:
                System.out.println("default");
        }
    }
}
