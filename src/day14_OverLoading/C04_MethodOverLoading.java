package day14_OverLoading;

public class C04_MethodOverLoading {
    public static void main(String[] args) {
        topla(3,5);
        topla(3.2,5.2);
        topla(22.2,55);
        topla(3f,4);
    }
    public static void topla(int a, int b){
        System.out.println("iki sayının toplamı" + (a+b));
    }
    public static void topla(double a, double b){
        System.out.println("İki sayının toplamı : "+ (a+b));
    }

    public static void topla(int sayi1, double sayi2) {
        System.out.println(sayi2+sayi1);
    }
    public static void topla(double sayi1, int sayi2){

        System.out.println(sayi1 + sayi2);
    }

}
