package day04_WrapperClas;

public class C01_AscııTable {

    public static void main(String[] args) {

        /*
        24==>11000
        a==>
         */

        System.out.println(5+ 'a');

        char ilkHarf=101;
        System.out.println(ilkHarf);

        //kullanıcının verdiği harften bir sonrakini yazdır

        char grilenChar='f';

        System.out.println(grilenChar+1); //103

        //biz 103 değil 103 ün karşılğı olan char ifadesini yazmak istersek explicet castin yapmalıyız


        System.out.println( "girilen harften bir sonraki harf: " +(char) (grilenChar+1));

        // Verilen harften iki önceki harfi yazdırın.

        grilenChar='c';

        System.out.println("verilen harften bir önceki harf: "+ (char) (grilenChar-2) );

        System.out.println(grilenChar-2);















    }


}
