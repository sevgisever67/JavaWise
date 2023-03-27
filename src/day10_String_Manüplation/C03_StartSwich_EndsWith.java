package day10_String_Manüplation;

public class C03_StartSwich_EndsWith {

    public static void main(String[] args) {
        String str="Java harika";
        System.out.println(str.startsWith("a"));
        System.out.println(str.startsWith(str));
        System.out.println(str.startsWith("ja"));
        System.out.println(str.endsWith("ka"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith(str));
        System.out.println(str.endsWith(str.substring(str.length() - 1)));



    }
}
