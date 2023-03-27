package day16_doWhileOOP_Scope;

import java.util.Arrays;

public class C04_ArrayinElementleriniArttırma {
    public static void main(String[] args) {

        int [] fiyatlar={15, 25, 30, 10, 50};
        //tüm ürünlere 3 lira fiyat düzenlemesi yapınız

        for (int i =0; i< fiyatlar.length; i++ ){
            fiyatlar[i] +=3;
        }
        System.out.println(Arrays.toString(fiyatlar));

      /*  for (int i=0; i< fiyatlar.length ; i+=2){
            if (fiyatlar[i]<30){

                System.out.print("fiyatlar iyi "+fiyatlar[i]);
                System.out.println(" ");
            }else {
                System.out.println("çok pahalı" + fiyatlar[i]);
            }
        }
        System.out.println(Arrays.toString(fiyatlar) +" çok pahalı");*/

    }
}
