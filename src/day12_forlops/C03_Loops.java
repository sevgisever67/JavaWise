package day12_forlops;

public class C03_Loops {
    public static void main(String[] args) {
            /*oru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
            sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
            Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
             */

        int bas=-8;
        int bit=+6;
        int toplam=0;

        if (bas<=bit){
            for (int i=bas;i<=bit; i++){
                toplam+=i;
            }
        }else {
            for (int i=bas; i>=bit; i--){
                toplam+=i;
            }
        } System.out.println(toplam);

    }
}
