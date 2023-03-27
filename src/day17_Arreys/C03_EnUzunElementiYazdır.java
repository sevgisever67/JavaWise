package day17_Arreys;

import java.util.Arrays;

public class C03_EnUzunElementiYazdır {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String [] arr1={"melike","inci","ali","Emre"};
        enUzunKısaYazdır(arr1);


    }
    public static void enUzunKısaYazdır(String[]arr){
        String enUzun=arr[0];
        String enkısa=arr[0];
        for (int i=0;i< arr.length; i++){
            if (arr[i].length()<enkısa.length()  ){
                enkısa=arr[i];
            }
            if (arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }
        }
        System.out.println("En Uzun index : "+ enUzun+ "\nEn kısa index : " + enkısa);

    }

}
