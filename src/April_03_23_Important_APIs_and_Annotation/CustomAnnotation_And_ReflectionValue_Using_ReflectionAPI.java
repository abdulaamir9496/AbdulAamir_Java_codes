package April_03_23_Important_APIs_and_Annotation;

import java.lang.annotation.*;

//Custom annotation and reflection value using reflection API (java.lang)
//Created own custom annotation, with target/method/variable/class.
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})    //Here target is used only in class we can
@Retention(RetentionPolicy.RUNTIME)      //Custom annotation
@interface FootballPlayer      //Custom annotation
{
    String country() default "India";        //custom made String default values
    int age() default 28;       //custom made int default values
}
@FootballPlayer
class Messi       //class
{
    @FootballPlayer
    private int freeKick;     //variable
    private int goalKick;     //variable

    @FootballPlayer
    public int getFreeKick()     //getter method
    {
        return freeKick;
    }
    public void setFreeKick(int freeKick)     //setter method
    {
        this.freeKick = freeKick;
    }
    public int getGoalKick()       //getter method
    {
        return goalKick;
    }
    public void setGoalKick(int goalKick)     //setter method
    {
        this.goalKick = goalKick;
    }
}
public class CustomAnnotation_And_ReflectionValue_Using_ReflectionAPI {
    public static void main(String[] args) {

        Messi m = new Messi();     //object
        m.setFreeKick(2);      //invoking setter method by providing values
        m.setGoalKick(4);      //invoking setter method by providing values

        System.out.println(m.getFreeKick());      //calling getter method
        System.out.println(m.getGoalKick());      //calling getter method

        Class c = m.getClass();      //getClass
        Annotation a = c.getAnnotation(FootballPlayer.class);      //Getting annotations
        FootballPlayer fb = (FootballPlayer) a;     //down-casted
        System.out.println(fb);

        String country = fb.country();      //Created an object for inbuilt annotation's
        System.out.println(country);       //Calling inbuilt annotation

        int age = fb.age();       //Created an object for inbuilt annotation's
        System.out.println(age);      //Calling inbuilt annotation
    }
}
/*
The Annotation is metadata. Annotation is information.
We can use annotation to a class, interface, Variable, Method,
Used by compiler, runtime & other tools to generate code.

To get inside values which are already inbuilt of an annotation APIs, we can use getClass. @getAnnotation
 */