package day7_genelTekrar;

import java.util.Scanner;

public class C06_İfElse {
    public static void main(String[] args) {

      /*Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
      vucut kitle endeksini hesaplayin
      (kilo*10000 / (boy *boy)) vucut kitle endeksi
      (kilo*10000 / (boy *boy)) vucut kitle endeksi
       30’dan buyukse obez, 25-30 arasi ise kilolu,
      20-25 arasi ise normal, 20’den kucukse zayif yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Kg Giriniz : ");
        double kilo = scan.nextDouble();

        System.out.print("Lütfen Boyunuzu Cm Olarak Giriniz : ");
        double boy = scan.nextDouble();

        double kitleEndeksi = (kilo * 10000 / (boy * boy));
        System.out.println("Vücut Kitle Endeksiniz : "+kitleEndeksi);

        if (kitleEndeksi > 30) {
            System.out.println("Obezsiniz");

        } else if (kitleEndeksi > 25) {
            System.out.println("Kilolusunuz");

        } else if (kitleEndeksi >= 20) {
            System.out.println("Normal Kilodasınız");

        }else if (kitleEndeksi >0){
            System.out.println("Zayıfsınız");

        }else System.out.println("Yanlış Giriş");

    }
}
