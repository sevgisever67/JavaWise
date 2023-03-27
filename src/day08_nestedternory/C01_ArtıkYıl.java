package day08_nestedternory;

import java.util.Scanner;

public class C01_ArtıkYıl {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("bir yıl giriniz");

        int yıl= scan.nextInt();

        if (yıl%4!=0){
            System.out.println("Artık yıl değil");

        } else if (yıl%100!=0) {
            System.out.println("Artık yıl ");
        } else if (yıl%400==0) {
            System.out.println("artık yıl ");

        }
        else {
            System.out.println("Artık Yıl Değil");
        }


    }
}
