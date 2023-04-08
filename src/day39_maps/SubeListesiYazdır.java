package day39_maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SubeListesiYazdır {
    public static void main(String[] args) {
        Map<Integer,String> sevgiMap=MapMethodDepo.ornekMapOlustur();
        sevgiMap.put(12,"sevgi-tester-new-Reated-rejected");
        sevgiMap.put(13,"ebru-tester-new-Reated-rejected");
        sevgiMap.put(14,"melike-tester-new-unReated-rejected");
        sevgiMap.put(15,"sümeyra-tester-new-unReated-rejected");
        System.out.println(sevgiMap);
        SubeListesiOluştur1(sevgiMap);


    }

    private static void SubeListesiOluştur1(Map<Integer, String> sevgiMap) {
        Collection<String> sevgiValueCollection=sevgiMap.values();
        //[sevgi-tester-new-Reated-rejected,
        // ebru-tester-new-Reated-rejected,
        // melike-tester-new-unReated-rejected,
        // sümeyra-tester-new-unReated-rejected]

        int sira=1;
        for (String eachValue:sevgiValueCollection) {
           String[] valueArr=eachValue.split("-");//[sevgi, tester, new, Reated, rejected]
           if (valueArr[3].equalsIgnoreCase("m")){
               System.out.println(sira+" "+ valueArr[0]+ " " +valueArr[1]);
               sira++;
           }
        }
    }

}
