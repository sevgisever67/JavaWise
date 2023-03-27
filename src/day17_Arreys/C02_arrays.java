package day17_Arreys;

public class C02_arrays {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[]arr1={1,2,5,2,7,9};
        elemanSayısıYazdır(arr1,8);
        elemanSayısıYazdır(arr1,2);

        String [] arr2={"ayse", "semra", "halil" ,"sevcan"};
        elementSayısıYazdır(arr2,"ayse");





    }public static void elemanSayısıYazdır(int[]arr, int arananSayı){
        int sayaç=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==arananSayı){
                sayaç++;
            }
        }
        if (sayaç>=1){
            System.out.println("aradığınız element "+ sayaç + " kere kullanılmış");
        }else {
            System.out.println("aradığınız element yoktur");
        }

    }
    public static void elementSayısıYazdır(String[] arr, String arananElement){
        int sayaç=0;
        for (int i =0; i<arr.length; i++){
            if (arr[i].equals(arananElement)){
                sayaç++;
            }
        }
        System.out.println(sayaç + " kere kullanılmış");

    }

}
