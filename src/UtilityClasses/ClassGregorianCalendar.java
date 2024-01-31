package UtilityClasses;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClassGregorianCalendar {

    public static void main(String[] args) {

        Calendar today1 = Calendar.getInstance();

        GregorianCalendar today = new GregorianCalendar();

        printDate(today);
        System.out.println();

        GregorianCalendar today2 = new GregorianCalendar(2024, 0, 1);
        printDate(today2);

        System.out.println();

        GregorianCalendar today3 = new GregorianCalendar(2024, 0, 1, 14, 30, 23);
        printDate(today3);

    }

    private static void printDate(Calendar today) {

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int day = today.get(Calendar.DAY_OF_MONTH);
        int hour = today.get(Calendar.HOUR_OF_DAY);
        int minutes = today.get(Calendar.MINUTE);
        int seconds = today.get(Calendar.SECOND);

        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", day, (month+1), year, hour, minutes, seconds);


    }
}
