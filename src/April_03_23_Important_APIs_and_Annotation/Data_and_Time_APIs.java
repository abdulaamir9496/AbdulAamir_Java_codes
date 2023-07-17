package April_03_23_Important_APIs_and_Annotation;

//import java.util.Date;
//import java.util.ArrayList;
public class Data_and_Time_APIs {
    public static void main(String[] args) {

        /*
        When we don't import the package, we can write in the below-shown formats.
        Without parameter, we can create
        Efficient to use. It shows a long time Zone, Date
        Can be used only within java
         */
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long timeInMs = dt.getTime();

        /*We have to give parameter in sql.Data. Without parameter, it shows error
        Not much efficient to use. It Can also be used apart from java. Like: DB
        It only shows Date
         */
        java.sql.Date date = new java.sql.Date(timeInMs);
        System.out.println(date);

        /*java.util.ArrayList al = new java.util.ArrayList<>();
        System.out.println(al);*/
    }
}
