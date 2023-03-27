package day19_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {
        //verilen bir array den tekrareden sayıları silip
        //her bir elementin sadec bir kez kullanıldığı hale dönüştürün.

        int []arr={ 3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};
        //Bir tane boş bir list olustur
        //arrydeki her bir elemanı ele alalım;
        //elealdığımız element listte varsa ekle yoksa ekleme,

        List<Integer> benzersizElemetler=new ArrayList<>();

        for (int i=0; i< args.length; i++){
            if (!benzersizElemetler.contains(arr[i])){
                benzersizElemetler.add(arr[i]);

            }
        }System.out.println(benzersizElemetler);
        arr=new int[benzersizElemetler.size()];

        for (int i=0; i< arr.length; i++){
            arr[i]=benzersizElemetler.get(i);

        }
        System.out.println(Arrays.toString(arr));


    }
}
