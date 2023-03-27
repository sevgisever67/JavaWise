package day11_StringManüplationForlop;

public class C03_Replaca {
    public static void main(String[] args) {

        String str="Java candır";
        System.out.println(str.replace('j', 'h'));
        System.out.println(str.replace("ja", "ha"));
        System.out.println(str.replace("v", "yaya"));
        System.out.println(str.replace("Ja","oy9999"));

        System.out.println(str.replaceFirst("a", "b"));
        System.out.println(str.replace("a", "e"));
        str.replace("a","e");


    }
}
