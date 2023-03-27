package day21_ArrayiArrayList_For;

public class C02_For_EachLoop {
    public static void main(String[] args) {

        int[]arr1={1,2,5,2,7,9,3,6};

        int toplam=0;
        for (int each:arr1) {
            toplam+=each;
        }
        System.out.println("Elementler Toplamı "+ toplam);

        for (int each:arr1
             ) {
            if (each%3==0){
                System.out.print(each);
            }
        }
        System.out.println("==========");


        int sayaç=0;
        for (int each:arr1
             ) {if (each%2!=0) sayaç++;

        }
        System.out.print("Array 'deki tek sayılar="+ sayaç);

    }
}
