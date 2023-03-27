package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        //verilen bir arrayde istenen elemanın olup olmadığını bulur

        int[]arr={4,9,1,5,11,3,7,4,6,11};
      //  System.out.println(Arrays.binarySearch(arr, 5));
      //  System.out.println(Arrays.binarySearch(arr, 11));

        //Array de binarySearch metodunun düzgün çalışması için öncelikle ford çalıştırır
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.toString(arr));


    }
}
