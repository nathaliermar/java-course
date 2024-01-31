package ApiDatesJava8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class ClassLocalDate {

  public static void main(String[] args) {

        // date dd MM yyyy
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println(LocalDate.of(2022, 9, 22));
        System.out.println(LocalDate.parse("2022-09-22"));

        // Add days, months, years,weeks
        System.out.println(now.plusDays(40));
        System.out.println(now.plusMonths(30));
        System.out.println(now.plusYears(20));
        System.out.println(now.plusWeeks(10));

        // Decrease days, months, years, etc
        System.out.println(now.minus(1, ChronoUnit.DAYS));
        System.out.println(now.minus(1, ChronoUnit.MONTHS));
        System.out.println(now.minus(1, ChronoUnit.YEARS));

        // Get day of week, month, year
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfYear());

        // leap year
        System.out.println(now.isLeapYear());

        // using parse to set a year, is it a leap year? boolean response
        System.out.println(LocalDate.parse("2020-02-02").isLeapYear());

        // time now
        LocalTime hNow = LocalTime.now();
        System.out.println(hNow);

        // Instantiate the time differently
        System.out.println(LocalTime.of(20, 18));
        System.out.println(LocalTime.parse("20:18"));

        // Add hours, minutes, etc. to the time
        System.out.println(hNow.plusHours(2));
        System.out.println(hNow.plusMinutes(20));

        // Decease hours, minutes, etc. to the time
        System.out.println(hNow.minus(40, ChronoUnit.MINUTES));
        System.out.println(hNow.getHour());

        // date + time
        LocalDateTime nowComplete = LocalDateTime.now();
        System.out.println(nowComplete);

        System.out.println(LocalDateTime.of(2020, 2, 12, 18, 20));

       // iso pattern
        System.out.println(LocalDateTime.parse("2024-01-27T00:26:44.267295"));

        // add years to the previous time
        System.out.println(nowComplete.plusYears(20));

        // ZoneId
        ZoneId spindle = ZoneId.systemDefault(); // padrao do sistema
        System.out.println(spindle);

        // All time zones
       Set<String> spindles = ZoneId.getAvailableZoneIds();
       for (String s : spindles) {
           System.out.println(s);
       }

       ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2024-01-27T00:26:44"), sp);
        System.out.println(zdt);

        // String transformation to object instance
        System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]"));


        // Date calculated by adding offset
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(nowComplete, offset);
        System.out.println(offsetdt);

        //Convert date/calendar to latest language api
        // Instant Java 8+ replaced Date
        // Mapping an object's column to a dateTime column, we normally use Instant.

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);

        System.out.println(ldtDate);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(),sp));
    }
}
