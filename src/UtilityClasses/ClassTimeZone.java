package UtilityClasses;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class ClassTimeZone {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();

        System.out.println(tz);

        // What are the time zones available in Java
        String[] spindles = TimeZone.getAvailableIDs();
        for (String spindle: spindles) {
            System.out.println(spindle);
        }

        // Different time zone or configure a default zone
        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");

        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());


        //Convert dates and save them somewhere
        Calendar now = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(now.getTime()));

        Calendar nowSP = Calendar.getInstance(tzSP);
        System.out.println(nowSP.getTimeZone());
        System.out.println(sdf.format(nowSP.getTime()));


        // Difference in time zone is the time of day in this case
        // divide the milliseconds by 1000/ 60/ 60 * (-1) to give the correct time.
        // In this case we didn't have a difference in the times because I didn't change the location.

        nowSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis()) / 1000 / 60/ 60 * (-1)));
        System.out.println(sdf.format(nowSP.getTime()));

    }
}
