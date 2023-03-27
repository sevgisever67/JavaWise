package day17_Arreys;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanıcıdanBirDeğerAlarakMetodOluşturma {
    //Kullanıcıdan array oluşturmak üzere pozitif tam sayı alın.
    //Kullanıcıya işlemi bitirmesi için sıfıra basmasını söyleyin
    //bir önceki class tan method çağırarak aldığınız elementleri ekleyin.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int girilenSayı=1;
        int []arr=new int[0];//[]

        while (girilenSayı!=0){
            System.out.println("array e eklemek için pozitif tam sayıları girin." +
                    " işlemi bitirmek için 0'a basın");
            girilenSayı=scan.nextInt();
            if (girilenSayı!=0){
                arr=C06_ArrayElementEklemeMetodu.arraysElementEkle(arr,girilenSayı);
            }

        }System.out.println(Arrays.toString(arr));



    }
}
