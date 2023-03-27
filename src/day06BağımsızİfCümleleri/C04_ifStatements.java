package day06BağımsızİfCümleleri;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {

        //Soru 5 Kullanıcıdan notunu alın
        //       50veya daha büyükse "Sınıfı Geçtin"
        //       50 den düşükse "Malesef Kaldın" yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>=50) {
            System.out.println("Geçtiniz");
        }
        if (not<=50){
            System.out.println("Malesef Kaldınız");}

        /*
        if statement den sonra {} kullanmazsak java ilk ; 'e kadar olan kısmı if body olarak kabul eder.

        İf body 1 satır ise bu bir sorun olmaz ama if bady bir satırdan çoksa ilk satırdan sonrası her durumda çalışır

         */
    }
}
