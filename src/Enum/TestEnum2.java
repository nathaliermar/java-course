package Enum;

public class TestEnum2 {

  public static void main(String[] args) {

        System.out.println(Enum.valueOf(DayWeek.class, "MONDAY"));

        DayWeek day = Enum.valueOf(DayWeek.class, "MONDAY");

        System.out.println(day);
    }
}
