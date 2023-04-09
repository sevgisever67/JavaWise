package studyMyself;

import day39_maps.MapMethodDepo;
import org.w3c.dom.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntry {
    public static void main(String[] args) {
        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();
        SınıfaGöreListeYazdır(okulMap,10);

    }

    private static void SınıfaGöreListeYazdır(Map<Integer, String> okulMap, int istenenSınıf) {
        Set<Map.Entry<Integer,String>> okulEntrySet=okulMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry:okulEntrySet) {
            String value=eachEntry.getValue();
            String[]valueArr=value.split("-");
            if (valueArr[2].equalsIgnoreCase(istenenSınıf+"")){
                System.out.print(eachEntry.getKey()+" ");
                System.out.print(valueArr[0]+ " "+ valueArr[1]+ " "+ valueArr[4]);
                System.out.println(" ");
            }

        }
    }
    }
