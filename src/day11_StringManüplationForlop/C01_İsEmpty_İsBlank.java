package day11_StringManüplationForlop;

public class C01_İsEmpty_İsBlank {
    public static void main(String[] args) {

       String str="Java Candır";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        str="  ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

    }
}
