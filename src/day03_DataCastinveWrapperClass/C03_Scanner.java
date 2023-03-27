package day03_DataCastinveWrapperClass;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Çemberin yarıçapını giriniz");

        double yaricap= scan.nextDouble();


        System.out.println("Çemberin Çevresi: " + 2*3.14*yaricap);
        System.out.println("Daireni alanı: "+ 3.14*yaricap*yaricap );



    }

}
