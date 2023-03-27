package day16_doWhileOOP_Scope;

import java.util.Arrays;

public class C_Tekrar {
    public static void main(String[] args) {

        String [] isimler={"sevgi, leyla, kamil"};

        int [] sayılar={1, 2, 3, 4, 5, 6, 10};

        String [] liste=new String[5];



        System.out.println(isimler);
        Arrays.toString(isimler);

        sayılar[5]=1;
        System.out.println(Arrays.toString(sayılar));
        System.out.println(sayılar[4]);


    }
}
