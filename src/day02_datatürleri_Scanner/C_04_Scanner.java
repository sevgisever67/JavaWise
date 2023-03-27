package day02_datatürleri_Scanner;

import java.util.Scanner;

public class C_04_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz:");

        int girilenSayi= scan.nextInt();

        System.out.print("girilen sayının iki katı:"+ girilenSayi*2);

        System.out.print("\nlütfen İsminizi Giriniz");
        String isim= scan.next();




    }

}
