package day11_StringManüplationForlop;

public class C05_ReplaceAll {
    public static void main(String[] args) {

        String str="J&ava54 C+an01dir,,,,,";
        //str 'i Java candır haline getirin.

        str=str.replaceAll("\\d","");
        str=str.replaceAll(" ","5");
        str=str.replaceAll("\\W", "");
        str= str.replaceAll("5"," ");

        System.out.println(str);

        System.out.println(str.toUpperCase());


    }

}
