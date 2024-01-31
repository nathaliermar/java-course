package UtilityClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormattingDates {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z ");

        Calendar date = new GregorianCalendar(2010, 2, 20, 14, 32, 22);

        System.out.println(sdf.format(date.getTime()));

        // Date Class
        Date today = new Date();

        System.out.println(sdf.format(today));


        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String myDate = "20/02/2000";


        try {
            Date myDateInDate = sdf1.parse(myDate);

            System.out.println(myDateInDate);

            System.out.println(sdf.format(myDateInDate));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
