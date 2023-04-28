package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {

    public static void main(String[] args) {
        // Kullanicidan istedigi kadar tamsayi alip toplayin
        // Kullanici q'ya bastiginda islemi sonlandirip
        // kac sayi girildigini ve toplamini yazdirin
        // q veya Q disinda tamsayi olmayan bir deger girilirse
        // hata mesaji verip, yeni deger isteyerek isleme devam edin
        String str="45";
        Integer sayı=Integer.parseInt(str);


        int sayac=0;
        int toplam=0;
        int girilenSayi=0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("toplanmak uzere tamsayi giriniz \nBitirmek icin q'ya basin");

            try {

                girilenSayi= scan.nextInt(); // q,Q veya gecersiz baska input girerse exception olusur
                toplam += girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {
                e.printStackTrace();
                break;
            }


        }while(true);

        //System.out.println("Bu is bu kadar");
    }
}