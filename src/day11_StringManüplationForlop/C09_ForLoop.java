package day11_StringManüplationForlop;

public class C09_ForLoop {
    public static void main(String[] args) {

        //50 den başlayıp 100 dahil
        // sayıları yanyana aralarında bir boşlık olacak şekilde yazdırın.
        for (int i =50; i<=100; i++){
            System.out.print(i+ " ");

        }//100 den başla 1000 ' e kadar 23 ile bölünen sayıları yazdır

        System.out.println("");
        for (int i = 100; i < 1000; i++) {
            if (i % 23 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("  ");

        //20 den başla 7  şer artarak 100 kadar yazdır.
        // 100 gerekiyorsa yazdır ama 100 geçmeyin.

        for (int i = 20; i <= 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("000");
        // 100 den başla geriye doğru 7 ye bölünen sayıları yazdır

        for (int i = 100; i >= 1; i--) {
            if (i % 7 == 0) {
                System.out.print(i + "  ");
            }
        }




    }
}