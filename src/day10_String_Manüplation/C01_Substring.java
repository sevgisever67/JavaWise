package day10_String_Manüplation;

public class C01_Substring {
    public static void main(String[] args) {
        String str="Java Ne Kadar Güzeldir";
        //substring iki farklı şekilde kullanılabilir/*
        System.out.println(str.substring(8));
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(str.length()-1));
        //iki parametre girilirse başlangıç indeksinden başlar bitiş indexine kadar olan bölümü yazdırır.

        System.out.println(str.substring(5, 7));
        System.out.println(str.substring(3,4));
        System.out.println(str.substring(0,1).toLowerCase());
        System.out.println(str.substring(2,2));
        System.out.println(str.substring(5,1));//yanlış Run Time Error






    }
}