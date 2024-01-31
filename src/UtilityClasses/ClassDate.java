package UtilityClasses;

import java.util.Date;

public class ClassDate {

    public static void main(String[] args) {

        Date today = new Date();

        System.out.println(today);

        System.out.println("Milliseconds since January 1, 1970 is " + today.getTime());

        System.out.println(today.getDate());

    }
}
