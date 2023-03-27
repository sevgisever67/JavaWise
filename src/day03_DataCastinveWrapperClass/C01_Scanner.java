package day03_DataCastinveWrapperClass;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz:");
        String isim= scan.nextLine();

        System.out.println("lütfen Soyisminizi giriniz:");
        String soyİsim= scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz:");
        double yas= scan.nextDouble();

        System.out.println("İsminiz:" +isim + "\nSoyisim:" +soyİsim+ "\nYaşınız:" +yas + "\nKaydınız Başarıyla tamamlanmıştır");

        //Kullanıcı İstediğimiz Data Türünde Bilgi Girişi Yapamazsa
        //Kodunuzda Hata Oluşur ve Durur.
        //Şimdilik Biz Ne İtersek Kullanıcı Onu Yapıyormuş Gibi Kmabul Edelim.






    }

}
