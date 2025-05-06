package chapter3;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class StartOfSummer {
    public static void main(String[] args) {
        //LocalDate date = LocalDate.of(2014, 6, 21);\
        //LocalDate date1=LocalDate.of(2014, 5, 21);

        //LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        //date.plusDays(2);
        //date.plusHours(3);
        //System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());


        //LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        //System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());


        //LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        //date.plusDays(2);
        //date.plusYears(3);
        //System.out.println(date.getYear() + " " + date.getMonth() + " "
        //+ date.getDayOfMonth());


        //LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        //Period p = Period.of(1, 2, 3);
        //d = d.minus(p);
        //DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        //System.out.println(d.format(f));


        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
        .SHORT);
        System.out.println(f.format(d));
    }
}
