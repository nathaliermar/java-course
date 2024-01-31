package UtilityClasses;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class ClassDateFormat {

    public static void main(String[] args) throws ParseException {

        Date today = new Date();

        System.out.println(Locale.getDefault());

        String todayFormatted = DateFormat.getInstance().format(today);
        System.out.println(todayFormatted);

        // Time
        todayFormatted = DateFormat.getTimeInstance().format(today);
        System.out.println(todayFormatted);

        // Date
        todayFormatted = DateFormat.getDateInstance().format(today);
        System.out.println(todayFormatted);

        // Time and Date
        todayFormatted = DateFormat.getDateTimeInstance().format(today);
        System.out.println(todayFormatted);

        // Short format of time
        todayFormatted = DateFormat.getTimeInstance(DateFormat.SHORT).format(today);
        System.out.println(todayFormatted);

        // Medium
        todayFormatted = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(today);
        System.out.println(todayFormatted);

        // Long
        todayFormatted = DateFormat.getTimeInstance(DateFormat.LONG).format(today);
        System.out.println(todayFormatted);

        // Junction
        todayFormatted = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.SHORT).format(today);
        System.out.println(todayFormatted);

        //
        String date = "12/02/2002 12:21";
        Date dataDate = DateFormat.getInstance().parse(date);
        System.out.println(dataDate);
    }
}
