package day08_nestedternory;

import java.util.Scanner;

public class C11_SwitchStatement {
    public static void main(String[] args) {
        //llanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf gir");
        char harf=scan.next().charAt(0);
        harf=Character.toLowerCase(harf);

        if (harf=='p'){
            System.out.println("pazar, pazartesi veya perşembe");
        } else if (harf=='s') {
            System.out.println("salı");

        } else if (harf=='c') {
            System.out.println("çarşamba cuma");

        }
else {
            System.out.println("geçersiz harf");
        }


        switch (harf){
            case 'p':
            System.out.println("pazartesi, perşembe"); break;
            case 's':
                System.out.println("salı"); break;
            case 'c':
                System.out.println("cuma; cumartesi ve carşamba");break;
            default:
                System.out.println("geçersiz harf");
        }


    }
}
