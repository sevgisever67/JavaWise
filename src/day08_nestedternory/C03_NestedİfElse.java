package day08_nestedternory;

import java.util.Scanner;

public class C03_NestedİfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı girin");
        int yas = scan.nextInt();
        System.out.println("cinsiyetinizi girin");
        char cinsiyet = scan.next().charAt(0);

        if (yas<16||yas>80){
            System.out.println("geçersiz yaş");
        } else if (yas<60) {
            if (cinsiyet=='k'||cinsiyet=='K'){ System.out.println("emekeli olmak için"+ (60-yas)+ "yıl daha çalışmalısın");}
            else if (cinsiyet=='e'||cinsiyet=='E') {System.out.println("emekeli olmak için"+ (65-yas)+ "yıl daha çalışmalısın");}
        } else if (yas<65) {
            if (cinsiyet=='k'||cinsiyet=='K'){
                System.out.println("emekli olabilirsin");
            } else if (cinsiyet=='e'||cinsiyet=='E') {
                System.out.println("emekeli olmak için+ (65-yas)+ yıl daha çalışmalısın");
            }

        }
        else {//65-85arası
            System.out.println("emekli olabilirsin");
        }

    }
}
