package day12_forlops;

public class C07_Nested_ForLoop {
    public static void main(String[] args) {

        //verilen bir rakam için çarpım tablosu oluşturun.

        int sayı = 4;
        int k = 1;

        for (int i = 1; i <= sayı; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");
        k++;

        for (int i = 1; i <= sayı; i++) {

            System.out.print(k*i + " ");
        }
        System.out.println("");
        k++;

        for (int i = 1; i <= sayı; i++) {
            System.out.print(i * k + " ");
        }System.out.println("");
        k++;
        for (int i=1; i<=sayı; i++){

            System.out.print(i*k+ " ");
        }

        System.out.println("\n============");

        for (k=1; k<=sayı; k++){
           for (int i=1; i<=sayı; i++){
               System.out.print(i*k+" ");
           }
            System.out.println(" ");

        }


    }
}
