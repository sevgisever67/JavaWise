package day12_forlops;

public class C08_Nested_ForLoop {
    public static void main(String[] args) {

        /*
                   * * * * *
                   * * * * *
                   * * * * *
         */

        int satırSayısı=3;
        int sütünSayısı=5;

        for (int i=1; i<=satırSayısı;i++){
            for (int k=1; k<=sütünSayısı;k++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }

        System.out.println(" =========");

        for (int i=1; i<=satırSayısı;i++){
            for (int j = 1; j <=sütünSayısı ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("   ===========");
        int sayı=5;

        for (int i=1; i<=sayı; i++){
            for (int j =1 ; j <=sayı; j++) {
                System.out.print(i*j+ " ");

            }
            System.out.println("  ");
        }





    }
}
