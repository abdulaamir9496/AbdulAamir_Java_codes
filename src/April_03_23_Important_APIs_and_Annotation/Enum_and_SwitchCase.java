package April_03_23_Important_APIs_and_Annotation;
//Enum and Switch Case
enum Result1
{
    PASS, FAIL, NR;
}
public class Enum_and_SwitchCase
{
    public static void main(String[] args) {
        Result1 res = Result1.PASS;
        switch (res)
        {
            case PASS:
                System.out.println("Passed!");
                break;
            case FAIL:
                System.out.println("Failed");
                break;
            case NR:
                System.out.println("No Result");
        }
    }
}
