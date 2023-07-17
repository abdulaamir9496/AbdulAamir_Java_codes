package April_03_23_Important_APIs_and_Annotation;
//Joda API for using inbuilt classes of Data and Time

import java.time.*;

public class More_On_Date_and_Time_API {
    public static void main(String[] args) {
        /*We can't use any constructor here as there is no constructor in joda API's
        We have to use 'now' method to invoke for getting details
        Using Joda Date is efficient compare to previously as we discussed.
        As per the requirement, we can use other inbuilt classes apart from mentioned below
         */
        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "/" + month + "/" + year);

        /*We can't use any constructor here as there is no constructor in joda API's
        We have to use 'now' method to invoke for getting details
        Using Joda Time is efficient compare to previously as we discussed.
        As per the requirement, we can use other inbuilt classes apart from mentioned below
         */
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nano = time.getNano();

        System.out.println(hour + "/" + minute + "/" + second + "/" + nano);
    }
}
