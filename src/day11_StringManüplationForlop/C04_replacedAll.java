package day11_StringManüplationForlop;

public class C04_replacedAll {
    public static void main(String[] args) {

        String str="J1a23va34 5C54and65ir87";
        //str deki sayıları method'la temizleyin tamizleyin.
        //REGEX (Regular Expression )

       // System.out.println(str = str.replaceAll("\\d", ""));
      //  System.out.println(str.replaceFirst("\\d", ""));
        System.out.println(str.replaceAll("\\D", ""));


    }


}
