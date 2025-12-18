package DateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class DateClass {
    public static void main(String[] args) {
        LocalDate customDate = LocalDate.of(2002,07,31);
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int dayOfMonth = today.getDayOfMonth();
        int monthValue = today.getMonthValue();
        Month month = today.getMonth();
        System.out.println(dayOfMonth);
        System.out.println(monthValue);
        System.out.println(month);
        System.out.println(year);
        System.out.println(today);
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);
        LocalDate pastDate = today.minusMonths(150);
        System.out.println(pastDate);


    }
}
