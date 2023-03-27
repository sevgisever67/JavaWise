package day7_genelTekrar;

import java.util.Scanner;

public class C05_İfElse {
    public static void main(String[] args) {

       /* Kullanicidan cinsiyetini ve yasini alin,
                Kadin, 60 yas ve uzeri ,
                Erkek 65 yas ve uzeri emekli olabilir.
                Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
                “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Yaşınızı Giriniz");

        int yas = scan.nextInt();
        System.out.println("Lütfen Cinsiyetinizi Giriniz" +
                " \n Kadın için K Erkek İçin E Giriniz");
        char cinsiyet = scan.next().charAt(0);

        if ((cinsiyet == 'k' && cinsiyet == 'K' && yas >= 60) || (cinsiyet == 'E' && yas >= 65))
            System.out.println("Emekli Olabilir");


    }

    }


