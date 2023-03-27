package day14_OverLoading;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //Kullanıcıdan bir şifre isteyin.
        //aşağıdaki şartları sağlayana kadar
        //her seferinde hataları söyleyip yeni şifre isteyin
        //şartlar sğlandığında "5. denemenizde başarılı şifre oluşturuldu."
        //-ilk harf küçük harf olmalı
        //-son harf büyük harf plmalı
        //-boşluk içermemeli ve /en az 8 karakter olmalı.

        Scanner scan=new Scanner(System.in);
        String sifre="";
        int flag=0;
        int denemeSayısı=0;

        while (flag!=4){
            flag=0;
            System.out.println("Lütfen bir şifre giriniz");
            sifre=scan.nextLine();
            if (sifre.charAt(0)>='a'&&sifre.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("ilk harf küçük olmalı");
            }if (sifre.charAt(sifre.length()-1)>='A'&&sifre.charAt(sifre.length()-1)<='Z'){
                flag++;
            }else {
                System.out.println("son harf buyuk harf olmalı");
            }if (sifre.contains(" ")){
                System.out.println("boşluk olmamalı");
            }else {
                flag++;
            }if (sifre.length()>=8){
                flag++;
            }else {
                System.out.println("en az 8 karakter olmalı");
            }
                denemeSayısı++;

        }
        if (flag==4){
            System.out.println("tebrikler! "+ denemeSayısı + "denemede şifreniz başarı ile kaydedildi");
        }



    }
}
