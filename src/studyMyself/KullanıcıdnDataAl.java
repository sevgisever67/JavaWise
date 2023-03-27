package studyMyself;

import java.util.Arrays;
import java.util.Scanner;

public class KullanıcıdnDataAl {
    public static void main(String[] args) {
        int [] arr={3,5,4};
        System.out.println("forEach");
        for (int each:arr
             ) {
            System.out.print(each + " ");
        }
        System.out.println(" forİ ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+2;
            System.out.print( arr[i]+ " ");
        }
        System.out.println(" forEach ");
        for (int each:arr
             ) {
            System.out.print(each+3+ " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
