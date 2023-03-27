package day06BağımsızİfCümleleri;

import java.util.Scanner;

public class C08_ifElseStatement {
    public static void main(String[] args) {

        //Kullanıcıdan bir karakter İsteyin.
        // Girilen karakter küçük  ise büyük harf olarak yazdıın.
        // yoksa girilen harfi yzdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter giriniz ");
        char krk=scan.next().charAt(0);

        if ('a'<=krk && krk<='z') {
            System.out.println(Character.toUpperCase(krk));
        }
        else {
            System.out.println(krk);
        }

    }
}
