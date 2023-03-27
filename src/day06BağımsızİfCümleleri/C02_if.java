package day06BağımsızİfCümleleri;

import java.util.Scanner;

public class C02_if {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayı 5 ile bölünebiliyorsa 5 in katıdır yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı= scan.nextInt();

        if (sayı%5==0) {
            System.out.println("Girdiğinmiz sayı 5 in katıdır");
        }

        //Kullanıcıdan bir sayi alın
        // 3 ile bölünebiliyorsa3 ile bölünebilen sayı
        // 5 ile bölünebiliyorsa 5 ile bölünebilen sayıdır yazdırın.

        if (sayı%3==0) {
            System.out.println("3 ile bölünebilen sayı");
        }
        //








    }

}
