package day08_nestedternory;

import java.util.Scanner;

public class C04_Ternory {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir tam  bir sayı alın
        //çift ise çift
        //degilse tek sayı yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayı gir");
        int sayi= scan.nextInt();

        if (sayi%2==0) {System.out.println("çift sayı");}
        else{
            System.out.println("tek sayı");
        }
        System.out.println(sayi%2==0 ? "çift sayı":"tek say");

    }
}
