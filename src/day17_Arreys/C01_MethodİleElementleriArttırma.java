package day17_Arreys;

import java.sql.Array;
import java.util.Arrays;

public class C01_MethodİleElementleriArttırma {
    //verilen bir int array in elementlerini 2 iki arttirip bize döndüren bir metod oluşturun.
    //kaç kare yazıldığını yazdırın
    public static void main(String[] args) {
          int [] arr={3,4,5,6} ;
          int [] arr2={6,7,5,9,};
          int arr1[]=arrayElementleriniArttır(arr,3);
          arrayElementleriniArttır(arr2,5);
        System.out.println(Arrays.toString(arr2));



    }

    public static int[] arrayElementleriniArttır(int [] ilkarr, int artis) {
        for (int i = 0; i < ilkarr.length; i++) {
            ilkarr[i] += artis;
        }
        return ilkarr;

    }

}
