package day7_genelTekrar;

import java.util.Scanner;

public class C04_İfElse {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
// sayi 3 ile bolunebiliyorsa "3'un kati"
// sayi 5 ile bolunebiliyorsa "5'in kati"
// sayi hem 3 hem de 5 ile bolunebiliyorsa "3 ve 5'in kati" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Gİriniz");
        int sayi= scan.nextInt();

        if (sayi%3==0&&sayi%5==0){
            System.out.println("3 v3 5 in katı");
        } else if (sayi%3==0) {
            System.out.println("3 ün katı");
        } else if (sayi%5==0) {
            System.out.println("5 in katı");
        }


    }
}
