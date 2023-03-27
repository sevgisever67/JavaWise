package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMetodu {
    //Bir Stringi istediğimiz parçalara ayırmak için kullanılır

    public static void main(String[] args) {
        String str="Java candir can ";

        System.out.println(str.length());



        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler.length);

        // en uzun kelime kac harflidir ?

        int enUzunKelimeLength=kelimeler[0].length();
        for (int i= 0; i<kelimeler.length; i++){
            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength=kelimeler[i].length();
            }
        }
        System.out.println(enUzunKelimeLength);



       System.out.println("En Uzun Kelimenin Karakter Sayısı : "+enUzunKelimeLength);


        // bir string'i karakterlerine ayirmak istersek

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));










    }

}
