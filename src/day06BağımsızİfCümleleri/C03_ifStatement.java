package day06BağımsızİfCümleleri;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {
        //Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın
        // eğer eşkenar üçgense bunu yazdırın.
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir üçkenin kenar uzunluklarını giriniz");
        double knr1= scan.nextDouble();
        double knr2= scan.nextDouble();
        double knr3= scan.nextDouble();
        if (knr1==knr2&&knr3==knr1&&knr1>0) {
            System.out.println("Eşkenar Üçgen");
        }
    }
}
