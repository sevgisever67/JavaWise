package day06BağımsızİfCümleleri;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {
        //Soru3_ Kullanıcıdan yaşını isteyin.
        // 65 yaş üzeri ise emekli olabilirsin yoksa olamazsın yazdırn.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Yaşınızı Giriniz");
        double yas= scan.nextDouble();

        if (yas>=65) {
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olabilmek için "  + (65-yas )+ " yıl daha çalışmalısın");
        }







    }
}
