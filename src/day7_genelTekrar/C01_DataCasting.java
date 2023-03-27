package day7_genelTekrar;

public class C01_DataCasting {
    public static void main(String[] args) {
        //Javada Bazı data türleri asla başka data türlerine çevrilemez.

        /*String str1=false;
        String str2=20;
        boolean bl1='a';
        int sayı1="Merhaba";

         */

        //Özelliklesayısal data türündeki değerler
        // başka sayısal data türündeki variable lare aktarılabilir.

        double dbl1=23;
        short sh1=12;
        int sayı2=sh1;

        sh1 =(short) sayı2;
        sayı2 = (int)dbl1;

        //wrapper kullanarak



    }
}
