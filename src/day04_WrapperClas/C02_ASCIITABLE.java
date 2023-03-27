package day04_WrapperClas;

import java.util.Scanner;

public class C02_ASCIITABLE {

    public static void main(String[] args) {
        //Kullanıcıdan bir harf alın ve alfabadeki sonraki 3. harfi yazdırın.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz");

        char girilenHarf=scan.next().charAt(0);

        System.out.println( (char)(girilenHarf+1) + ","+ (char)(girilenHarf+2));

        int a=20;
        int b=6;
        System.out.println( (double) a/b);


    }


}
