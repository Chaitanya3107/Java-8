package DateAndTime;

import java.time.LocalTime;

public class TimeClass {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current time " + now);
        LocalTime customTime = LocalTime.of(12, 54, 20);
        System.out.println(customTime);
        String timeInString = "14:25:20"; // time in string
        LocalTime parsedTime = LocalTime.parse(timeInString);
        System.out.println(parsedTime);
        LocalTime timeBeforeOneHour = now.minusHours(1);
        System.out.println(   "Time before one hour " +timeBeforeOneHour);

    }
}
