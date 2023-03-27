package day11_StringManüplationForlop;

public class C07_Replace {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        String şifre="lf*9gl8icoç71";
        int flag=0;

        if (şifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
        }else {
            flag++;
        }
        if (şifre.charAt(şifre.length()-1)>'0'&&şifre.charAt(şifre.length()-1)<='9'){
            flag++;
        }else {
            System.out.println("son karakter rakam olmalı");

        }
        if (şifre.charAt(0)<='z'&&şifre.charAt(0)>='a'){
            flag++;
        }else {
            System.out.println("ilk karakter küçük harf olmalı");
        }
        if (şifre.length()>=10){
            flag++;
        }
        else {
            System.out.println("şifre 10 karakter olmalı");
        }
        if (flag==4){
            System.out.println("şifreniz başarılı bir şekilde oluşturuldu");
        }



    }
}
