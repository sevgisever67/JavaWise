package day19_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C07_Sublist {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(22);
        sayilar.add(53);
        System.out.println(sayilar); //[3, 5, 2, 13, 22, 53]

        System.out.println(sayilar.subList(2, 5)); //[2, 13, 22]
        System.out.println(sayilar);
        List<Integer> yeniList= sayilar.subList(3,5);

        System.out.println(yeniList); // [13, 53]






    }
}
