package day39_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class upDate {
    public static void main(String[] args) {
        Map<Integer, String> sevgiMap=MapMethodDepo.ornekMapOlustur();
       sevgiMap= SubeleriDeğiştir(sevgiMap,"m","r");
        System.out.println(sevgiMap);

    }

    private static Map<Integer,String> SubeleriDeğiştir(Map<Integer, String> sevgiMap,String eskiSube,String yeniSube) {
        Set<Integer> okulKeySet=sevgiMap.keySet();
        for (Integer eachKey:okulKeySet) {
            String [] ValuetArr=sevgiMap.get(eachKey).split("-");//[Veli, Han, 10, H, MF]
            if (ValuetArr[3].equalsIgnoreCase(eskiSube)){
                ValuetArr[3]=yeniSube;
            }
            String yeniValuue="";
            for (int i = 0; i < ValuetArr.length-1; i++) {
                yeniValuue+=ValuetArr[i]+"-";

            }yeniValuue+=ValuetArr.length-1;
            sevgiMap.put(eachKey,yeniValuue);
        }

        return sevgiMap;
    }
}
