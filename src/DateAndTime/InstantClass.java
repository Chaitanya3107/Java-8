package DateAndTime;

import java.time.Instant;

public class InstantClass {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Instant now = Instant.now(); // this is nano seconds
        System.out.println(now);


    }
}
