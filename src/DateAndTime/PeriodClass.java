package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate past = LocalDate.of(2000, 6, 20);
        Period period = Period.between(now, past);
        System.out.println(period);
        int years = period.getYears();
        System.out.println(years);
    }
}
