package day12_forlops;

public class C02_forLoops {
    public static void main(String[] args) {

       /* Soru 4- Kullanicidan baslangic ve
       bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki
       tum sayilarin toplamini yazdirin.
       Bitis degeri baslangic degerinden kucuk olsa da program calissin*/

        int baş=20;
        int bit=40;
        int top=0;

        if (bit<baş){
            System.out.println("başlangıç bitişten küççük olmalı");
            }
        else {
            for (int i=baş; i<=bit; i++){
                //sayıların toplamı=toplam +i
                top+=i;
            } System.out.print(top+ " ");
        }

    }
}

