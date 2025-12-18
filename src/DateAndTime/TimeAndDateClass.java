package DateAndTime;

import java.time.LocalDateTime;

public class TimeAndDateClass {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime parsedDateTime = LocalDateTime.parse("2025-07-31T10:50");
        System.out.println(parsedDateTime);
        LocalDateTime localDateTime = parsedDateTime.minusDays(15);
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = parsedDateTime.minusHours(2);
        System.out.println(localDateTime1);

    }
}
