package day06BağımsızİfCümleleri;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        /*
        eğer birolay için sadece 2 olasılık varsa
         ve biri çalışacaksa if else kıllanılır.
         */
//if else statementte
// if ya da else bodysi mutlaka çalışır.
// ikisinin biirden çalışşma veya çalışmamama ihtimali yoktur.



        //Soru 5 Kullanıcıdan notunu alın
        //       50veya daha büyükse "Sınıfı Geçtin"
        //       50 den düşükse "Malesef Kaldın" yazdırın.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50) {
            System.out.println("Geçtiniz");
        }
        else {
            System.out.println("Malesef Kaldınız");}




        // Kullanıcıdn pozitif bir tamsayı alın
        // sayının tek veya çift olduğunu yazdırın.

        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0) {
            System.out.println("sayi çifttir");
        }
        else {
            System.out.println("sayı tektir");
        }




        // Kullanıcıdan pozitif bir tamsayı alın
        // ve 5 ile bölünüp bölünmediğini yazdırın.
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi2= scan.nextInt();

        if (sayi2%5==0) {
            System.out.println("sayi 5 ile bölünebilir ");
        }
        else {
            System.out.println("sayı 5 ile bölünemez");
        }




    }
}
