package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime parsed = LocalDateTime.parse("2025-12-18T23:00:00.523801600");
        System.out.println(parsed);

        LocalDate dateToday = LocalDate.parse("2025-12-20");
        System.out.println(dateToday);
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = todayDate.format(myFormatter);
        System.out.println(formattedDate);

        String date = "30/06/2025";
        LocalDate parse = LocalDate.parse(date, myFormatter);
        System.out.println(parse);

    }
}
