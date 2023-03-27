package day09_switch_stringManüpilation;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
        //Kullanıcıdan Ay nosu Alıp Mevsimi Yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen AyNosunu Giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            case 12:
                System.out.println("Kış");
                break;
            default:
                System.out.println("Geçersiz Giriş");
        }


    }
}
