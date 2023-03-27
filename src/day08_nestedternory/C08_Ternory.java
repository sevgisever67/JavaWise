package day08_nestedternory;

public class C08_Ternory {
    public static void main(String[] args) {
        //llanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin
        char harf='m';

        System.out.println(harf>='a'&&harf<='z'? Character.toUpperCase(harf):harf);

    }
}
