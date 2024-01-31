package UtilityClasses;

import java.util.Calendar;

public class ClassCalendar {

    public static void main(String[] args) {

        Calendar today = Calendar.getInstance(); // Singleton design pattern

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int day = today.get(Calendar.DAY_OF_MONTH);
        int hour = today.get(Calendar.HOUR_OF_DAY);
        int minutes = today.get(Calendar.MINUTE);
        int seconds = today.get(Calendar.SECOND);

        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", day, (month+1), year, hour, minutes, seconds);


        // Adding dates
        today.add(Calendar.DAY_OF_MONTH, 4);

        // Subtracting dates
        today.add(Calendar.DAY_OF_MONTH, -5);

        System.out.println();

        System.out.println(today.get(Calendar.DAY_OF_MONTH));
    }
}
