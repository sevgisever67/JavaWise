package day7_genelTekrar;

import java.util.Scanner;

public class C03_İfElse {
    public static void main(String[] args) {// kullanicidan pozitif bir tamsayi alin
      // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliyorsa "5'in kati"
        // sayi hem 3 hem de 5 ile bolunebiliyorsa "3 ve 5'in kati" yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen Bir Tam Sayı Giriniz : ");
        int sayi = scan.nextInt();
        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Sayı hem 3'ün hemde 5'in Katıdır.");
        } else if (sayi % 3 == 0) {
            System.out.println("Sayı 3'ün Katıdır.");
        } else if (sayi % 5 == 0) {
            System.out.println("Sayı 5'in Katıdır.");
        } else System.out.println("Sayı ne 3'ün nede 'in katıdır");


    }
}


