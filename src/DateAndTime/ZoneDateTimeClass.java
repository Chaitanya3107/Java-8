package DateAndTime;

import java.sql.SQLOutput;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeClass {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(x -> System.out.print(x + " "));
        System.out.println();
        ZonedDateTime india = ZonedDateTime.now();
        System.out.println(india);
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(usa.getZone());
        System.out.println(usa);
//        ZonedDateTime customZoneDateTime = ZonedDateTime.of(2002, 07, 31, 16, 20, 45, 30, ZoneId.of("America/New_York"));
//        System.out.println(customZoneDateTime);
    }
}
