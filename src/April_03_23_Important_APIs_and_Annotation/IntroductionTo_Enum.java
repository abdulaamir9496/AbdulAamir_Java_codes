package April_03_23_Important_APIs_and_Annotation;
//Enum --1.5, java.lang(all ENUM inbuilt classes we have)

import java.time.temporal.ValueRange;

enum Week
{
    /*No need to use any keywords like: public, private, protected, default, static.
    Here the ENUM itself is a value, variable, constant, everything
    We can use upper and lower cases both. But as a convention, as a good java developer, we have to follow it is recommended
    to write in capital letters which cannot be changed.
    Because this is a java's syntax convention
    */
    MON, TUE, WED, THUR, FRI, SAT, SUN;
}
public class IntroductionTo_Enum {
    enum Result
    {
        PASS, FAIL, NR;
    }
    public static void main(String[] args) {

        /*Can we create an object of 'abstract class'? NO,
        Can we create an object of an Interface? NO,
        In the same way, we cannot create an object of ENUM. If we create, we get compile time ERROR.
         */
        Week w = Week.MON;
        System.out.println(w);

        /*
        Here we have defined ENUM outside the main class. Can we define inside the main class?
        Yes, we can define ENUM outside and inside a class
         */
        /*Result r = Result.PASS;
        System.out.println(r);*/

        /*
        In class, we have to define everything when we create a constant / constant variable.
        We can't simply write and leave it gives compile time ERROR.
        Like: we have to define private, public, default, static & data type etc.,
        Whereas, in ENUM we don't need to define anything
         */
       //Mon;

        /*
        We can invoke and use internal ENUM default classes
         */
        //ordinal: Returns Index value:
        int index = Week.MON.ordinal();
        System.out.println(index);

        //Values: Returns Values & using enhanced for-loop print index values as well.
        Week []  wr = Week.values();
        for (Week w1 : wr)
        {
            System.out.println(w1 + " : " + w1.ordinal());
        }
    }
}
