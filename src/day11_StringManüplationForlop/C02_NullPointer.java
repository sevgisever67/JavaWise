package day11_StringManüplationForlop;

public class C02_NullPointer {
    public static void main(String[] args) {

        //Null Bir Değer Değildir
        //Null bir pointer dır.
        //Yanına yazıldığı Non_Primitive Variabla değer atanmadığını işaret eder.

        String str=null; //str oluşturuldu ama değer atamadı.

        //Java method içerisinde değer atamadan variable oluşturulmasına izin verir.
        //ama değer atmadqan kullanılmasına izin vermez.

       System.out.println(str);  //CTE
        //str.concat("Java");   //CTE


        //Değer verilmediğini işaretler ama CTE oluşmasını Engelleyecek Null Pointer olusturulmuştur.

        System.out.println(str+"Java");

        //Primitive variable için Null Değeri atanmaz.

        //Biz genelde String bir ifade oluşturup sonra değer oluşturacaksak hiçlik değeri atarız.
        String str2="";

        System.out.println(str.isEmpty());

        //Null olarak işaretlenmiş bir variabla hiçbir metod kullanılqamaz.
        //sadece yazdırılabilir ve işlem yapılabilir.

        System.out.println(str2.isEmpty());
        int str3;
        str=null;

        System.out.println(str);
        //System.out.println(str3);











    }

}
