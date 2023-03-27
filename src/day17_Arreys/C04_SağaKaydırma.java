package day17_Arreys;

import java.util.Arrays;

public class C04_SağaKaydırma {
    public static void main(String[] args) {
        // Verilen int bir array'deki tum elementleri bir saga kaydirip
        // sondaki elementi de en basa alip kaydedin
        // orn : [3,4,5,6]  ==> son hali : [6,3,4,5]

        int[] arr = {3, 4, 5, 6};
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));



    }

}
