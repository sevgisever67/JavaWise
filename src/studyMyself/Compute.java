package studyMyself;

import java.util.Map;
import java.util.TreeMap;

public class Compute {
    public static void main(String[] args) {
        String [] arr={"a","a","b","m","n","n"};
                Map<String,Integer> kullanımMiktarı=new TreeMap<>();
        for (String each:arr) {

            if (!kullanımMiktarı.containsKey(each)){
                kullanımMiktarı.put(each,1);
            }else {
                int elementlerinEskiKullanımMiktarı=kullanımMiktarı.get(each);
                kullanımMiktarı.put(each,elementlerinEskiKullanımMiktarı+1);
            }


        }
        System.out.println(kullanımMiktarı);

        for (String each:arr
             ) {
            kullanımMiktarı.computeIfPresent(each,(k,v)->v+1);
            kullanımMiktarı.put(each,1);
        }

    }
}
