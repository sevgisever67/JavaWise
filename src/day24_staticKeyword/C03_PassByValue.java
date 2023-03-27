package day24_staticKeyword;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        int [] arr={3,2,1};

        elemtleriArttır(arr,4);

    }

    private static int[] elemtleriArttır(int[] arr, int artisMiktari) {
        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=artisMiktari;

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
