package day10_String_Manüplation;

import javax.sound.midi.Soundbank;

public class C05_indexOf {
    public static void main(String[] args) {
        String str="Java cok ama cok guzel";
        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf("cok"));//5
        System.out.println(str.indexOf("cok", 6));
        System.out.println(str.indexOf("cok", 5));
        System.out.println(str.indexOf(1)+ "+++++++");

        //verilen bir cümlede istenen bir string için
        //asağıdaki cümlelerden uygun olanı yazdır
        //Aradığınız kelime cümlede 1 kere kullanılmıs
        //Aradığınız kelime cümlede 2 kere kullanılmıs
        //Aradığınız kelime cümlede 2 den fazla kullanılmıs

        String cümle="Yasasın java iyi ki java java java öğreniyorum";
        String kelime="java";

        if (cümle.indexOf(kelime)==-1){
            System.out.println("Aradığınız kelime cümle içinde kullanılmamıştır");
        }
        else {int kelimeİlkİndex=cümle.indexOf(kelime);
            int kelimeİkinciİndex=cümle.indexOf(kelimeİlkİndex+1);
            int kelimeÜçüncüİndex=cümle.indexOf(kelimeİkinciİndex+1);
            if (kelimeİlkİndex==kelimeİkinciİndex){
                System.out.println("Kelime 1 kere mevcut");
            } else if (kelimeİkinciİndex==kelimeÜçüncüİndex) {
                System.out.println("kelime iki kere yazılmış");

            }
            else {
                System.out.println("kelime birden fazla yazılmış");
            }
        }

        System.out.println(str.indexOf("Java"));


    }
}
