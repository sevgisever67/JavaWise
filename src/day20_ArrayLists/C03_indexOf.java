package day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Kübra");
        isimler.add("Mustafa");
        isimler.add("emre");
        isimler.add("erdal");
        isimler.add("erdal");

        System.out.println(isimler);
        System.out.println(isimler.get(2)); //index verirsek element gelir.
        System.out.println(isimler.indexOf("emre")); //elemti verirsek index gelr.
        System.out.println(isimler.lastIndexOf("Mustafa"));
        isimler.indexOf("Hilal");
        isimler.lastIndexOf("gökhan");
        System.out.println(isimler);
        System.out.println(isimler.indexOf("erdal"));
        System.out.println(isimler.lastIndexOf("erdal"));


    }
}
