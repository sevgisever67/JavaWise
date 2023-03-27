package day10_String_Manüplation;

public class C02_Contains {
    public static void main(String[] args) {
        String str="Java Öğren İşi Kap";

        System.out.println(str.contains("Java"));
        String s="ka";
        System.out.println(str.contains(s));
        System.out.println(str.contains(" "));
        System.out.println(str.contains(""));
        System.out.println(str.contains("Java"));

    }
}
