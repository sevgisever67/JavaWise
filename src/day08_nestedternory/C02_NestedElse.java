package day08_nestedternory;

import java.util.Scanner;

public class C02_NestedElse {
    public static void main(String[] args) {


        /* Kullanicidan cinsiyetini ve yasini alin,
                Kadin, 60 yas ve uzeri ,
                Erkek 65 yas ve uzeri emekli olabilir.
                Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
                “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
                 Hatalı giriş yapılırsa kullanıcıyı uyarın.

        */


        //birden fazla değişkene bağlı İf Else yazarken önce değişkenlerden
        //birine göre Ana yapıyı oluşturalı.
        //Bu soruda cinsiyeti ana değişken yapalım.


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int yas = scan.nextInt();

        System.out.println(" Lütfen Cinsiyetinizi Giriniz" +
                "\n Kadın için K Erkek İçin E Giriniz");

        char cinsiyet = scan.next().charAt(0);

        if (cinsiyet=='k'||cinsiyet=='K'){
            if (yas<16||yas>80){
                System.out.println("Geçersiz yaş girişi");
            } else if (yas<60) {
                System.out.println("emekli olmak için" + (60-yas) + "daha çalışmalısın");
            }
            else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet=='E'||cinsiyet=='e') {
            if (yas<16||yas>80){
                System.out.println("Geçersiz yaş girişi");
            } else if (yas<65) {
                System.out.println("emekli olmak için" + (65-yas) + "daha çalışmalısın");
            }else {
                System.out.println("Emekli olabilirsin");
            }
        }
        else {
            System.out.println("Geçersiz cinsiyet girişi");
        }


    }
}
