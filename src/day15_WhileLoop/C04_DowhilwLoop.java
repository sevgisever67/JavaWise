package day15_WhileLoop;

import java.util.Scanner;

public class C04_DowhilwLoop {
    public static void main(String[] args) {

        //Kullanıcıdan toplanmak üzere değerler alın.
        //kullanıcıya bitirmek için 0 a basmasını söyleyin.
        //  kullanıcı 0 a bassın
        //  0 a bastığında kaç sayı girdi ve toplamlarını yazdırın

       Scanner scan = new Scanner(System.in);

        int girilensayı=2;
        int toplam = 0;
        int sayıAdedi = 0;

         while (girilensayı != 0) {
           System.out.println("Toplanmak üzere tam sayı giriniz" +
                   " \n bitirmek için sıfıra basıız");//
           girilensayı = scan.nextInt();//
            if (girilensayı != 0) {
                sayıAdedi++;
                toplam += girilensayı;
            }
        }
        System.out.println(toplam + " " + sayıAdedi);
      int sayi=3;
       toplam=0;

        do {
            toplam+=sayi;
            sayi--;
        }while (sayi>0);
        System.out.println(toplam);

    }
}

