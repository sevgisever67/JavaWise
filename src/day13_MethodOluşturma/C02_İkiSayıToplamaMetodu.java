package day13_MethodOluşturma;

import java.util.Scanner;

public class C02_İkiSayıToplamaMetodu {
    public static void main(String[] args) {

        ikiSayıTopla();
        ikiSayıTopla();





    }

    public static void ikiSayıTopla(){
        Scanner scan=new Scanner(System.in);

        //iki sayı alıp, toplamlarını yazdıran bir method pluşturun.
       ikiSayıyıTopla();

    }
    public static void  ikiSayıyıTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double sayıı1=scan.nextDouble();
        double sayı2= scan.nextDouble();
        System.out.println(sayıı1+sayı2);

    }




}



