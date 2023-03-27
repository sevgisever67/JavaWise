package day12_forlops;

public class C04_Faktöriyel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.

        int sayi=5;
        int faktöriyel =1;

        for (int i=sayi; i>=1; i--){faktöriyel*=i;
            System.out.print( "5!: "+ i + " ");
        }
        System.out.println("\n");
        System.out.println( "5!:"+ faktöriyel);




    }


}
