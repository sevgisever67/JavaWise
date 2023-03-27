package day06BağımsızİfCümleleri;

import java.util.Scanner;

public class C07_ifelsestatement {
    public static void main(String[] args) {
        //Kullanıcıdn bir harf girmesini isteyin
        // büyük harf olup olmadığını yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");

        char krk=scan.next().charAt(0);//
        //krk==> A ile Z arasında mı?


        if ( 'A'<=krk&&krk<='Z' ){
            System.out.println("Girilen karakter büyüktür");
        }
        else {
            System.out.println("büyük değildir");
        }

    }
}
