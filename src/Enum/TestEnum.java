package Enum;

public class TestEnum {

  public static void main(String[] args) {

        DayWeek[] days = DayWeek.values();

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        for (DayWeek day : DayWeek.values()){
            System.out.println(day);
        }
    }
}
