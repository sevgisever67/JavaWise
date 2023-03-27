package day15_WhileLoop;

import java.util.Scanner;

public class
C01_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamları Toplanacak Pozitif tam sayı girin");
        int girilensayı= scan.nextInt();
        int sayi=girilensayı;
        int birlerBasamağı=0;
        int rakamlarToplamı=0;

        while (sayi>0){
            birlerBasamağı=sayi%10;
            rakamlarToplamı+=birlerBasamağı;
            sayi/=10;

        }
        System.out.println(rakamlarToplamı);

        System.out.println(C02_RakamlarToplamı.rakamlartoplamıBul(1555));
    }
}