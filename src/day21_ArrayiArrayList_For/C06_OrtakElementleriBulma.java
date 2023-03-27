package day21_ArrayiArrayList_For;

import java.util.ArrayList;

public class C06_OrtakElementleriBulma {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in
        // elementlerini karsilastirip,
        // ikisinde ortak olan elementleri
        // ayri bir liste olarak veren bir program yazin.
        Integer []arr1={2,3,6,7,4,7};
        Integer []arr2={1,3,5,7,9,3};

        ArrayList<Integer> ortakElemanlar = new ArrayList<>();
        for (Integer each1:arr1
             ) {
            for (Integer each2:arr2
                 ) {
                if (each1==each2&&!ortakElemanlar.contains(each1)){
                    ortakElemanlar.add(each1);
                }
            }

        }


    }
}
