package day08_nestedternory;

public class C10_NestedTernory {
    public static void main(String[] args) {
        /*
         /* Kullanicidan bir tamsayi alin.
        Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
        yazdirin
        Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        uygun olani yazdirin
         */


        int sayı=-20;

        System.out.println(sayı>0?
                sayı%2==0? "çift":"tek sayı" :sayı>99&&sayı<1000?"sayı 3 basamaklı":"3 basamaklı değil");



  }
}
