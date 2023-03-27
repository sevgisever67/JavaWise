package day15_WhileLoop;

public class C02_RakamlarToplamı {
    //verilen pozitif bir tamsayının
    // rakamlar toplamını bize döndüren bir metod olusturun

    public static int rakamlartoplamıBul(int verilensayı) {
        int sayı = verilensayı;
        int birlerBasamağı = 0;
        int rakamlartoplamı = 0;

        int basamakSayısı=(sayı+"").length();

        for (int i=1; i<=basamakSayısı; i++){
            birlerBasamağı=sayı%10;
            rakamlartoplamı+=birlerBasamağı;
            sayı/=10;



        }
        return rakamlartoplamı;


    }
}
