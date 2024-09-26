package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하세요");
        int year = scanner.nextInt();

        System.out.println("월을 입력하세요");
        int month = scanner.nextInt();

        getPrintCalendar(year, month);
    }

    private static void getPrintCalendar(int year, int month) {

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 월요일=1 .... 일요일=7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("offsetWeekDays = " + offsetWeekDays);

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while(dayIterator.isBefore(firstDayOfNextMonth)) {

            System.out.printf("%2d ",dayIterator.getDayOfMonth());

            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIterator = dayIterator.plusDays(1);
        }

    }
}
