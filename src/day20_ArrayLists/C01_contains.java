package day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        //uzun bir listeyi List olarak kaydetmek istersek;
        //tek tek eklemek istemezseniz
        //pratik olarak bir array olusturup

        int [] arr={1,2,3,4,5,6,};
        List<Integer>sayılar=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayılar.add(arr[i]);

        }
        System.out.println(sayılar);
        //listede 3 var mı
        System.out.println(sayılar.contains(3));
        System.out.println(sayılar.contains(9));

        sayılar.clear();
        System.out.println(sayılar);



    }
}
