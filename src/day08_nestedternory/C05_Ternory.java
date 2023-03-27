package day08_nestedternory;

import java.util.Scanner;

public class C05_Ternory {
    public static void main(String[] args) {

        //kullanıcıdan  bir tam  bir sayı alın
        //mutlak değerini yazı
        Scanner scan=new Scanner(System.in);

        System.out.println(" bir tam sayı gir");
        int sayi= scan.nextInt();

        if (sayi>=0){
            System.out.println(sayi);
        } else {sayi=sayi*-(1) ;
            System.out.println(sayi);
        }


        sayi=sayi>=0?sayi:sayi*(-1);
        System.out.println("sayi = " + sayi);



    }
}
