package studyMyself;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Locale;

public class LocalTime {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.isLeapYear());
        LocalDate tarih2=LocalDate.of(2220,10,12);
        System.out.println(tarih2.isLeapYear());
        System.out.println(tarih.plusWeeks(30));
        System.out.println(tarih.minusMonths(3));
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih2.getDayOfWeek());
        System.out.println(tarih2.getMonth());
        System.out.println(tarih2.getMonthValue());

        java.time.LocalTime saat= java.time.LocalTime.now();
        System.out.println(saat);

        LocalDateTime dtf=LocalDateTime.now();

        System.out.println(dtf.getHour());
        System.out.println(dtf.getDayOfYear());


    }
}
