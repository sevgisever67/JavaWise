package day05_icrementDecrement_Concatenation;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        /*
        Eğer sayının değeri SADECE 1 azalıp veya artacaksa bu
        yazdırıp sonra atama
        atayıp sonra yazdırma
        işlemlerini tek seferde yapabiliriz

         */

        int a=20;
        int b=a++;

        System.out.println(b);//20
        System.out.println(a);//21

        a=20;

        System.out.println(a++);//20
        System.out.println(a);//21

        a=20;
        System.out.println(--a);
         b=a+5;

        System.out.println(b);

        System.out.println(b++);
        System.out.println(b);


        String str1="25";
        int sayi= (Integer.parseInt(str1));
        System.out.println("sayi = " + sayi);





    }

}
