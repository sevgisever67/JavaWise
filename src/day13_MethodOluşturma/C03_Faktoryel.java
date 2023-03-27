package day13_MethodOluşturma;

public class C03_Faktoryel {
    public static void main(String[] args) {

        //Verdiğimiz bir sayının faktöryelini hesaplayın
        //sonucu döndüren bir method oluşturun.


        faktöryelHesapla(5);
        System.out.println(faktöryelHesapla(5));


        /*
        1-public static
        2-oluşturduğumuz method bir sonuç döndüreceksek döndüreceği sonucub değeri
        3-method ismi
        4--method parantezi içine
        methoda gönderemiz gereken bilgileri
        hangi variable ile göndereceğimizi yazalım (parametre)


         */
    }

public static int faktöryelHesapla(int sayi) {
    int faktoryel = 1;
    for (int i = sayi; i >= 1; i--) {
        faktoryel *= i;
    }

    return faktoryel;
}

}
