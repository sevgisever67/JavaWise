package day13_MethodOluşturma;

import java.util.Scanner;

public class C06_MethodOluşturma {
    public static void main(String[] args) {

        //verilen bir stringin Palindrom olup olmadığını yazdırın
        //düzden ve tersten aynı şekilde olan.
        //madam   kabak  12321;

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir Metin Giriniz");
        String metin=scan.nextLine();
        String tersmetin=C05_StringiTerseÇevirme.stringTersineÇevir(metin);


        if (metin.equals(tersmetin)) {
            System.out.println("girilen metin palidrom");

        }else {
            System.out.println("girilen metin palidrom");
        }




    }




}
