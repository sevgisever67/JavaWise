package day03_DataCastinveWrapperClass;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İsminizi , Soyİsminizi ve Yaşınızı Giriniz \n Lütfen Her Bilgiden Sonra Entera Basınız");

        char isimİlkHarf=scan.nextLine().charAt(0);
        String soyİsim= scan.nextLine();
        double yas= scan.nextDouble();

        System.out.println("girilen bilgiler : " + isimİlkHarf+" " +soyİsim +"; " + yas);






    }
}
