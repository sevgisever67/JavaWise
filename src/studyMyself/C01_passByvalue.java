package studyMyself;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_passByvalue {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(sayilar);
        elementleriArttır(sayilar);
        yeniListeAta(sayilar);
        System.out.println(sayilar);

    }public  static void elementleriArttır(List<Integer>sayilarListesi){
        for (int i =0; i<sayilarListesi.size(); i++){
            sayilarListesi.set(i, sayilarListesi.get(i)*2);

        } System.out.println(sayilarListesi);

    }public  static void yeniListeAta(List<Integer>sayilar){

        sayilar=new ArrayList<>(Arrays.asList(8,9,10));
        System.out.println(sayilar);




    }
}
