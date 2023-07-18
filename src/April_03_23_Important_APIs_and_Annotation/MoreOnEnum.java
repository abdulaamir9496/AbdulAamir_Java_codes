package April_03_23_Important_APIs_and_Annotation;
//More on Enum. We can create Variables, constructors, methods inside enums
enum Result
{
    PASS, FAIL, NR;
/*
In backend this enum constants be like:
public static final Result PASS = new Result();
public static final Result FAIL = new Result();
public static final Result NR = new Result();
 */
    int marks;     //variables
    Result()     //constructor
    {
        System.out.println("Constructor in Enum");
    }
    void setMarks(int marks)     //setter method
    {
        this.marks = marks;
    }
    int getMarks()      //getter method
    {
        return marks;
    }
}
public class MoreOnEnum {
    public static void main(String[] args) {

        Result.PASS.setMarks(80);
        int m1 = Result.PASS.getMarks();
        System.out.println(m1);

        int m2 = Result.FAIL.getMarks();
        System.out.println(m2);

        Result.NR.setMarks(88);
        int m3 = Result.NR.getMarks();
        System.out.println(m3);

    }
}
/*
When we set the value, we get the value which we have set before getting it/calling it
When we don't set any value and call it, we get the default value. As here int default value is zero.
As a java developer, we use automated annotations most of the time and rarely use ENUMS.
To have some idea, we have seen how it works.
 */