package day15_WhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //while Loope da bitiş şartı kontrolu her zaman body den 1
        //fazla çalışır.
        //while looptan kullanıcıdan alacağımız değerlere önce bizim değer atamamız gerekir.
        //bu da hatalara sebep olabilr

        int sayı=-20;
        int toplam=0;

        while (sayı>0){
            toplam+=sayı*sayı;
            sayı--;

        }
        System.out.println("while"+ toplam);
        sayı=-10;
        toplam=0;
        do {
            toplam+=sayı*sayı;
            sayı--;
        }while (sayı>0);
        System.out.println("do whileToplam"+ toplam);
    }



}
