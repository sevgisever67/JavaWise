package day10_String_Manüplation;

public class C06_lastİndex {
    public static void main(String[] args) {
        String str="Java bazen beyin yakar";

        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("a", 2));
        str.indexOf("a",4);
        System.out.println(str.indexOf('a'));


        //verilen bir cümlede istenen bir string için
        //asağıdaki cümlelerden uygun olanı yazdır
        //Aradığınız kelime cümlede 1 kere kullanılmıs
        //Aradığınız kelime cümlede 2 kere kullanılmıs
        //Aradığınız kelime cümlede 2 den fazla kullanılmıs

        String cümle="Yasasın java iyi ki java öğreniyorum";
        String kelime="java";


        int ilkindex=cümle.indexOf(kelime);
        int lastindex=cümle.lastIndexOf(kelime);

        if (ilkindex==-1){
            System.out.println("yok");
        } else if (ilkindex==lastindex) {
            System.out.println("1 kere");

        }else {
            System.out.println("1 den fazla");
        }



    }


}
