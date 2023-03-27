package day08_nestedternory;

public class C07_Ternory {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise
        //Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int knr1=12;
        int knr2=12;
        int knr3=12;

        System.out.println(knr1==knr3&&knr1==knr2&&knr1>0? "eşkenar": "eşkenar değil");


    }
}
