package studyMyself;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class DateTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.print(saat);
        System.out.println(saat.getNano());
        int toplam=0;

        int basSüresi=saat.getNano();
        for (int i = 0; i <100000 ; i++) {
            toplam+=i;

        }
        LocalTime saatson=LocalTime.now();
        int bitisSuresi= saatson.getNano();

        System.out.println("işlem süresi : " + (bitisSuresi-basSüresi));

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);
        System.out.println();
    }
}
