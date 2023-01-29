package calendarTheFirstVersion;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalendarTheFirstVersion {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 10, 14); // задаём текущее время
        int day = date.getDayOfMonth(); // день текущего месяца
        int month = date.getMonthValue(); // номер месяца
        date = date.minusDays(day - 1); // получили первый день месяца ( 17 - (17 - 1) )
        DayOfWeek weekDay = date.getDayOfWeek(); // получили день недели первого дня данного месяца
        int weekInt = weekDay.getValue();
        System.out.println(weekInt);
        StringBuilder s = new StringBuilder(); // строка на которую будем сдвигаться
        for (int i = 1; i < weekInt; i++) {
            for (int j = 0; j < 3; j++) {
                s.append(" ");
            }
            s.append(" ");
        }
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        while (date.getMonthValue() == month) {
            if (date.getDayOfMonth() == 1) {
                System.out.print(s);
            }
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == day) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
    }
}
