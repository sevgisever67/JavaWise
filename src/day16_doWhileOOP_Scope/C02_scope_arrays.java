package day16_doWhileOOP_Scope;

import java.util.Arrays;

public class C02_scope_arrays {
    public static void main(String[] args) {

        String [] isim={"nur", "berke", "Mustafa"};
        int []sayılar={3,2,5,4,6,7};
        char [] karakterler={'e','f','ş'};

        //Array non-primitive data türlerindendir.
        //Eğer arrayi liste şeklinde oluşturmayın;
        //new keybord kullanırsak
        //uzunluğunu yazmak zorundayız


        String [] arr=new String[5];//new Keyword

        //Bir array tanımlanan uzunluktan daha fazla veya az elaman alamaz.
        //Bir arrayi yazdırmak istersek
        System.out.println(isim); //direk yazdırılmaz

        System.out.println(Arrays.toString(isim)); //toString metodu ile yazdırılır

        System.out.println(Arrays.toString(arr)); // [ nul, nul, nul, nul,nul]

        int [] a=new int[7];
        System.out.println(Arrays.toString(a));// [0 0 0 0 0 0 0 ]

        //array deki elementlere nasıl ulaşırız? İndex ile;
        a[0]=4;
        a[3]=3;
        System.out.println(Arrays.toString(a));

        a[3]=1;
        System.out.println(Arrays.toString(a));


        String [] sınıfListesİ=new String[9];
        double [] sayılar2=new double[88];













    }
}
