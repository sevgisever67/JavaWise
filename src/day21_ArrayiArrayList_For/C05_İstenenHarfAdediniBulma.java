package day21_ArrayiArrayList_For;

import java.util.Arrays;

public class C05_İstenenHarfAdediniBulma {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cümle="Yat kalk java çalış";
        String istenenHarf="0";

        String []karakterler=cümle.split("");

        System.out.println(Arrays.toString(karakterler));//[Y, a, t,  , k, a, l, k,  , j, a, v, a,  , ç, a, l, ı, ş]
        int sayaç =0;
        for (String each:karakterler
             ) {
            if (each.equalsIgnoreCase("i")){
                sayaç++;
            }
        }
            if (sayaç==0){
                System.out.println("istenen harf cümlede kullanılmamış");
            }{
            System.out.println("istenen harf cümlede " + sayaç + " kez kullanılmış");
        }
    }
}
