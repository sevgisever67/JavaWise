package day15_WhileLoop;

public class C05_LocalVariable {

    public static void main(String[] args) {

        /*
        1- bir metod içeriside oluşturulan variable ın scope 'u o metoddur.
           başka bir metodda kullanılamaz.
           bu variable'lara LOkal variable denir.
        2- Her ne kadar bir metod içerisinde olsalar da loop 'un da ayrı bir scope' u vardır
           Loop dışında Kullanılamazlar;
        3- Lokal variable ları değer atamadan oluşturabiliriz fakat kullanamayız.

     */
        for (int i=0;i<10;i++){
            int j=i+1;

        }


        String isim="Ali Can";

    }
    public static void baskaMethod(){
        int sai=5;
    }

}
