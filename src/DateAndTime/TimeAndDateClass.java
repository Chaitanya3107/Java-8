package DateAndTime;

import java.time.LocalDateTime;

public class TimeAndDateClass {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime parsedDateTime = LocalDateTime.parse("2025-07-31T10:50");
        System.out.println(parsedDateTime);

    }
}
