package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.of(2024,1,1,0,0);
        LocalDateTime localDateTime = local.plusYears(1).plusMonths(2).plusDays(3).plusHours(4).plusMinutes(5);
        System.out.println("localDateTime = " + localDateTime);
    }
}
