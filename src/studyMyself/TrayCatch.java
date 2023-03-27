package studyMyself;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrayCatch {
    public static void main(String[] args) {
        int sayac=0;
        int toplam=0;
        int girilenSayi=0;
        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.println("tam sayı gir");
                girilenSayi=scan.nextInt();
                toplam+=girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {
                char input=scan.next().charAt(0);
                if (input=='q'||input=='Q'){
                    System.out.println(sayac);
                    break;
                }else {
                    System.out.println("tam sayı gir");

                }
            }

        }while (true);




    }
}
