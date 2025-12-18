package DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationClass {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        int sum =0;
        for(int i=0;i<1000000;i++){
            sum+=i;
        }
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.ofSeconds(1);
        Duration d22 = Duration.of(2, ChronoUnit.SECONDS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d22);

        LocalDateTime a = LocalDateTime.now();
        Thread.sleep(1000);
        LocalDateTime b = LocalDateTime.now();
        Duration duration = Duration.between(a,b);
        System.out.println(duration);
    }
}
