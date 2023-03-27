package day03_DataCastinveWrapperClass;

import java.util.Scanner;

public class C04_Scanner_dataCasting {
    public static void main(String[] args) {

       // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();


        double temp=0;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;


        System.out.println("sayı1: " + sayi1 + "sayı 2:"+ sayi2);

        //Bazı Primitive data Türleri Başka Hiçbir data Türlerinden Değer Kabul Etmez.
        //Bazı Primitive Data Türleri Başka Tür Data Türlerinden Değer Kabul Edeer.

        char ch='1';
        ch='½';



        long sayi=20;
        int sayi3=10;

        sayi3= (int) sayi;  //long değerini int türüne atayamam.

        int s;
        double S1=18;
        s=(int)S1;
        System.out.println(s);










    }

}
