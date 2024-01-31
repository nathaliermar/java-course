package Constants;

import java.time.DayOfWeek;

public class Test {

    public static void main(String[] args) {

        usingConstants();

        System.out.println();

        usingEnum();
    }

    private static void usingConstants() {
        int monday = DayWeekConst.MONDAY;
        int tuesday = DayWeekConst.TUESDAY;
        int wednesday = DayWeekConst.WEDNESDAY;
        int thursday = DayWeekConst.THURSDAY;
        int friday = DayWeekConst.FRIDAY;
        int saturday = DayWeekConst.SATURDAY;
        int sunday = DayWeekConst.SUNDAY;

        System.out.println("Test using constants in java");

//        printDayWeek(monday);
//        printDayWeek(tuesday);
//        printDayWeek(wednesday);
//        printDayWeek(thursday);
//        printDayWeek(friday);
//        printDayWeek(saturday);
//        printDayWeek(sunday);
    }

    private static void printDayWeek(DayWeek day){
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
        }
    }

    private static void usingEnum() {

        DayWeek monday = DayWeek.MONDAY;
        DayWeek tuesday = DayWeek.TUESDAY;
        DayWeek wednesday = DayWeek.WEDNESDAY;
        DayWeek thursday = DayWeek.THURSDAY;
        DayWeek friday = DayWeek.FRIDAY;
        DayWeek saturday = DayWeek.SATURDAY;
        DayWeek sunday = DayWeek.SUNDAY;

        System.out.println("Test using enum in java");

    }
}
