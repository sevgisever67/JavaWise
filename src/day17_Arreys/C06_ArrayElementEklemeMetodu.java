package day17_Arreys;

import java.util.Arrays;

public class C06_ArrayElementEklemeMetodu {
    public static void main(String[] args) {

        //verilen bir array' e istenen bir element ekleyrek
        //yeni halini bize döndüren bir metod oluşturun.

        int []arr={2,4,7,8};
        arr= arraysElementEkle(arr,5);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] arraysElementEkle(int [] arr, int eklenecekelement){
        int[]yeniArr=new int[arr.length+1];
        for (int i=0;i<arr.length; i++){
           yeniArr [i]=arr[i];
        }yeniArr[yeniArr.length-1]=eklenecekelement;

         return yeniArr;
    }



}
