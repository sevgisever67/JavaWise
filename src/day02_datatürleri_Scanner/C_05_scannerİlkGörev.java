package day02_datatürleri_Scanner;

import java.util.Scanner;

public class C_05_scannerİlkGörev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println(  "Girilen sayının karesi:" +girilenSayi*girilenSayi);

    }



}
