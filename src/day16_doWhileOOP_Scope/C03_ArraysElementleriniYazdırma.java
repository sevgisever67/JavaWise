package day16_doWhileOOP_Scope;

import java.util.Arrays;

public class C03_ArraysElementleriniYazdırma {
    public static void main(String[] args) {
        boolean [] bl=new boolean[4];
        int []arr={3, 5, 6, 89, };
        //Tüm arrey i yazdırırsak
        System.out.println(Arrays.toString(arr));

        // Arrayin tüm elementlerini yanyana bir boşluk olacak şekilde yazdır.

        for (int i=0; i< arr.length; i++){
            System.out.print(i+" ");

        }



    }

}
