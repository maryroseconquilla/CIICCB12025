package Task121;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MyDate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1978, 1, 1);
        LocalDate date2 = LocalDate.of(1984, 9, 21);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Total days between: " + daysBetween);

        // Count leap years
        int leapYearCount = 0;
        for (LocalDate date = date1; date.isBefore(date2.plusDays(1)); date = date.plusYears(1)) {
            if (date.isLeapYear()) {
                leapYearCount++;
            }
        }

        System.out.println("Number of leap years between the dates: " + leapYearCount);
    }
}
