package day10_String_Manüplation;

public class C04_endsWith {
    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        //  - mail @ icermiyorsa “gecersiz mail”
        //  - mail @gmail.com icermiyorsa, “mail gmail olmali”
        //  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        // yazdirin.

        String mail="Sevgisever@gmail.com";

        if (!mail.contains("@")){
            System.out.println("geçersiz");
        } else if (!mail.contains("@gmail")) {
            System.out.println("Geçersiz Mail");
        } else if (!mail.endsWith("@gmail")) {
            System.out.println("yazım hatası");
        }else {
            System.out.println("tebrikler");
        }


    }
}
