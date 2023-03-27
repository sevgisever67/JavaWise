package day09_switch_stringManüpilation;

import java.util.Locale;

public class C03_StringManüplation {
    public static void main(String[] args) {
        String str="Java Candır";
        System.out.println(str.toUpperCase());
        //String manüplasyon yapınca atama yapmazsak String kalıcı  olarak Değişmez.,
        System.out.println("str = " + str);

        //str 'yi tdile göre çevirmek.
        str=str.toLowerCase(Locale.forLanguageTag("Eng"));
        System.out.println("str = " + str);

        System.out.println(str.translateEscapes());

        String str1="hayat çok da adil değil güvenme";
        System.out.println(str1.toLowerCase(Locale.forLanguageTag("hr-HR")));
        System.out.println(str1.toUpperCase(Locale.of(Locale.ROOT.toLanguageTag())));
        System.out.println(str1.toUpperCase(Locale.getDefault()));
        System.out.println(str1.toUpperCase(Locale.forLanguageTag("eng")));

        System.out.println(str1.toUpperCase(Locale.forLanguageTag("TR")));
    }
}
