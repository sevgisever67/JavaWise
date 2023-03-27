package day15_WhileLoop;

public class C06_ClasLvelVariable {
    /*
            Bir Clas İçinde TümMetodların Erişebileceği Variable lar istenirse
            Class Level da (Class ın içi metodun dışı) oluşturulmalıdır.
          1-Class Level da oluşturulan variabla ların scope u tüm Class tır.
          2-Class Level da oluşturulan variablelara değer atamasa bile
            Java onlar için default Değerler atar,
          3-Class Level da oluşturulan variable 'lar static veya
               instance (static olmayan )olabilir,
          4-Static olarak tanımlanan variable lar tüm metodlarda kullanılabilir;
          5-Metod static ise içerisine static olmayan hiçbirşey almaz
     */



    static int sayı=10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;








    public static void main(String[] args) {
        System.out.println(sayı);
        System.out.println("String : "+ isim);// non-primitive türler için null
        System.out.println("boolean"+ bl); //false
        System.out.println("char : "+ chr);// ' ' hiçlik
        System.out.println("int : " + in1); //sayısal türler için 0
       // System.out.println(bl2);
    }
    public static void staticMetod(){
        System.out.println(sayı);
        System.out.println(chr);
        System.out.println(bl);
        System.out.println(in1);
       // System.out.println(bl2); // instance
       // System.out.println(in2); // instance

    }

    public  void staticOlmayanMetod(){

        sayı--;
        System.out.println(bl);
        System.out.println(bl2);
        System.out.println(in2);


    }


}
