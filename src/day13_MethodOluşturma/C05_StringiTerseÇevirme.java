package day13_MethodOluşturma;

public class C05_StringiTerseÇevirme {
    public static void main(String[] args) {
        //verilen bir stringi
        //tersine çevirip bize döndüren bir method oluşturun
        System.out.println(stringTersineÇevir("java candır"));
        System.out.println(stringTersineÇevir("gelcem"));
        System.out.println(stringTersineÇevir("adam"));
        System.out.println(stringTersineÇevir("ada"));


    }

    public static String stringTersineÇevir (String metin){
        String tersmetin=" ";

        for (int i=metin.length()-1 ; i>=0; i--){
            tersmetin+=metin.charAt(i);
        }
        return tersmetin;
    }


}
